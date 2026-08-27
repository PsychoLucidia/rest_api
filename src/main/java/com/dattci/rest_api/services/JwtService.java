package com.dattci.rest_api.services;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;

@Service
public class JwtService {
    private final SecretKey key;

    private final long expiration;

    public JwtService(SecretKey secretKey, @Value("${jwt.expiration}") long expiration) {
        key = secretKey;
        this.expiration = expiration;
    }

    public String createToken(UserDetails userDetails) {

            Date now = new Date();

            Date expire = new Date(now.getTime() + expiration);

        return Jwts.builder()
            .subject(userDetails.getUsername())
            .claim(
                "role", userDetails.getAuthorities()
                    .iterator()
                    .next()
                    .getAuthority()
            )
            .issuedAt(now)
            .expiration(expire)
            .signWith(key)
            .compact();
    }
}
