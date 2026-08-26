package com.dattci.rest_api.exeptionHandler.exceptions;

public class EmptyNameException extends RuntimeException {
    public EmptyNameException(String message) {
        super(message);
    }
}
