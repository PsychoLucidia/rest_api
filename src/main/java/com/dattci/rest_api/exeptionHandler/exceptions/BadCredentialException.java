package com.batch1_springboot.demo.exeptionHandler.exceptions;

public class BadCredentialException extends RuntimeException {
    public BadCredentialException(String message) {
        super(message);
    }
}
