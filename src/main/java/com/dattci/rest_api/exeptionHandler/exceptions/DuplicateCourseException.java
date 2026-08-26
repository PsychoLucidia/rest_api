package com.dattci.rest_api.exeptionHandler.exceptions;

public class DuplicateCourseException extends RuntimeException {
    public DuplicateCourseException(String message) {
        super(message);
    }
}
