package com.batch1_springboot.demo.exeptionHandler.exceptions;

public class EmptyNameException extends RuntimeException {
    public EmptyNameException(String message) {
        super(message);
    }
}
