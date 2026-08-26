package com.batch1_springboot.demo.exeptionHandler.exceptions;

public class HandleMissingException extends RuntimeException {
    public HandleMissingException(String message) {
        super(message);
    }
}
