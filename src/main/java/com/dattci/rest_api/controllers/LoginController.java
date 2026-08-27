package com.dattci.rest_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dattci.rest_api.dto.LoginRequest;
import com.dattci.rest_api.dto.LoginResponse;
import com.dattci.rest_api.services.CustomUserDetailsService;
import com.dattci.rest_api.services.JwtService;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@AllArgsConstructor
@RestController
@RequestMapping("/api/public/auth")
public class LoginController {
    private final AuthenticationManager authenticationManager;
    private final CustomUserDetailsService userDetailsService;
    private final JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginRequest(@RequestBody LoginRequest request) {
        
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.email(),
                request.passwordRaw()
            )
        );

        UserDetails details = userDetailsService.loadUserByUsername(request.email());

        String token = jwtService.createToken(details);
        
        return ResponseEntity.ok(new LoginResponse(token));
    }
    
}
