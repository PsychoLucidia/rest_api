package com.batch1_springboot.demo.exeptionHandler.exceptions;

public class NullInputException extends RuntimeException {
    public NullInputException(String message) {
        super(message);
    }
}
