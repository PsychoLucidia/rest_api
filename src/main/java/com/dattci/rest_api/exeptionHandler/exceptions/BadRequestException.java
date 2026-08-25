package com.batch1_springboot.demo.exeptionHandler.exceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }
}
