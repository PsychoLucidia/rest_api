package com.dattci.rest_api.dto;

import java.util.List;

public record StudentDisplayDTO(
    Long id,
    String firstName,
    String lastName,
    String email,
    String username,
    String courseName,
    List<String> enrolledSubjectIds
) {}
