package com.dattci.rest_api.dto;

public record AddCourseResponse(
    String timestamp,
    String message,
    String course,
    Long id
) { }
