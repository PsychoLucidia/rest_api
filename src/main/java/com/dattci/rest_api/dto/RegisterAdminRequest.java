package com.dattci.rest_api.dto;

public record RegisterAdminRequest(
    String firstName,
    String lastName,
    String email,
    String username,
    String password,
    String secretKey
) {}