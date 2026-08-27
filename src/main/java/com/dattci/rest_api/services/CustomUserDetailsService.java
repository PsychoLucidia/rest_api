package com.dattci.rest_api.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dattci.rest_api.entities.StudentEntity;
import com.dattci.rest_api.repositories.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    private final StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String identifier) throws UsernameNotFoundException {

        Optional<StudentEntity> studentOp = studentRepository.findByEmail(identifier);

        System.out.println("Email: " + studentOp.get().getEmail());

        System.out.println(passwordEncoder.matches("amogamog!", studentOp.get().getPassword()));

        StudentEntity student = studentOp.orElseThrow(() -> new UsernameNotFoundException("User not found."));

        return User.builder()
            .username(student.getEmail())
            .password(student.getPassword())
            .roles(student.getRole().name())
            .build();
    }
    
}
