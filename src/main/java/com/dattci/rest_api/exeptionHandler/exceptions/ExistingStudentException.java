package com.dattci.rest_api.exeptionHandler.exceptions;

import com.dattci.rest_api.entities.StudentEntity;

public class ExistingStudentException extends RuntimeException {

    public ExistingStudentException(StudentEntity student) {
        super(formatMessage(student));
    }
    
    private static String formatMessage(StudentEntity student) {
        return "Cannot create student. Student with email " + student.getEmail() + " already exists.";
    }
}
