package com.dattci.rest_api.exeptionHandler.exceptions;

import com.dattci.rest_api.entities.StudentEntity;

public class ExistingAdminException extends RuntimeException {

    public ExistingAdminException(StudentEntity student) {
        super(formatMessage(student));
    }
    
    private static String formatMessage(StudentEntity student) {
        return "Cannot create student. Email " + student.getEmail() + " already exists.";
    }
}
