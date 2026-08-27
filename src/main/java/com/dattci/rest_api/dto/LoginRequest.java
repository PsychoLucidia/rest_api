package com.dattci.rest_api.dto;

public record LoginRequest(
    String email,
    String passwordRaw
) { }
