package com.batch1_springboot.demo.exeptionHandler.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}