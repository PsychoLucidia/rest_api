package com.dattci.rest_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dattci.rest_api.config.MasterPass;
import com.dattci.rest_api.dto.DeleteAdminRequest;
import com.dattci.rest_api.dto.DeleteAdminResponse;
import com.dattci.rest_api.dto.LoginRequest;
import com.dattci.rest_api.dto.LoginResponse;
import com.dattci.rest_api.dto.RegisterAdminRequest;
import com.dattci.rest_api.dto.RegisterAdminResponse;
import com.dattci.rest_api.entities.StudentEntity;
import com.dattci.rest_api.enums.Roles;
import com.dattci.rest_api.exeptionHandler.exceptions.NotAuthorizedException;
import com.dattci.rest_api.exeptionHandler.exceptions.NotFoundException;
import com.dattci.rest_api.repositories.StudentRepository;
import com.dattci.rest_api.services.CustomUserDetailsService;
import com.dattci.rest_api.services.JwtService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/public/auth")
public class LoginController {

    private final MasterPass masterPass;

    private final StudentRepository studentRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;
    private final CustomUserDetailsService userDetailsService;
    private final JwtService jwtService;

    public LoginController(MasterPass masterPass, StudentRepository studentRepository,
            PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager,
            CustomUserDetailsService userDetailsService, JwtService jwtService) {
        this.masterPass = masterPass;
        this.studentRepository = studentRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginRequest(@RequestBody LoginRequest request) {
        
        UsernamePasswordAuthenticationToken credentials =
            new UsernamePasswordAuthenticationToken(request.email(), request.passwordRaw());

        authenticationManager.authenticate(credentials);

        UserDetails details = userDetailsService.loadUserByUsername(request.email());

        String token = jwtService.createToken(details);
        
        return ResponseEntity.ok(new LoginResponse(token, "Bearer"));
    }

    @PostMapping("/register/admin")
    public ResponseEntity<RegisterAdminResponse> registerAdminRequest(@RequestBody RegisterAdminRequest entity) {
        
        if (!entity.secretKey().equals(masterPass.getMasterPassword())) {
            throw new NotAuthorizedException("Master Password incorrect.");
        }
        
        StudentEntity saved = StudentEntity.builder()
        .firstName(entity.firstName())
        .lastName(entity.lastName())
        .email(entity.email().toLowerCase())
        .username(entity.username())
        .password(passwordEncoder.encode(entity.password()))
        .role(Roles.ADMIN)
        .build();

        studentRepository.save(saved);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        RegisterAdminResponse response = new RegisterAdminResponse(
            LocalDateTime.now().format(format),
            "Admin registered."
        );
    
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/delete/admin/{adminId}")
    public ResponseEntity<DeleteAdminResponse> deleteAdminById(@PathVariable Long adminId, @RequestBody DeleteAdminRequest request) {

        if (!request.secretKey().equals(masterPass.getMasterPassword())) {
            throw new NotAuthorizedException("Master Password incorrect.");
        }

        StudentEntity admin = studentRepository.findById(adminId)
                .orElseThrow(() -> new NotFoundException("Admin not found"));

        if (admin.getRole() != Roles.ADMIN) {
            throw new NotAuthorizedException("User is not an admin.");
        }

        studentRepository.delete(admin);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        DeleteAdminResponse response = new DeleteAdminResponse(
            LocalDateTime.now().format(format),
            "Admin deleted successfully."
        );

        return ResponseEntity.ok(response);
    }

}
