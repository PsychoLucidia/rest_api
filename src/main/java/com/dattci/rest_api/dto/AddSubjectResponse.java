package com.dattci.rest_api.dto;

public record AddSubjectResponse(
    String timestamp,
    String message,
    String subject,
    String subjectid,
    Long id
) {}
