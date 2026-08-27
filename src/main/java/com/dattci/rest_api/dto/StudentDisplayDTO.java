package com.dattci.rest_api.dto;

import java.util.List;

public record StudentDisplayDTO(
        Long id,
        String fullName,
        //        String email,
        String course,
        List<String> subjects
) {}
