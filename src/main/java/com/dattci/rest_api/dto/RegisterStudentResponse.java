package com.dattci.rest_api.dto;

public record RegisterStudentResponse(
    String message,
    String firstName,
    String lastName,
    String email,
    String username
) { }
