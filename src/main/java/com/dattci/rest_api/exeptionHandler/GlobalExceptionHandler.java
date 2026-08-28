package com.dattci.rest_api.exeptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.dattci.rest_api.exeptionHandler.exceptions.BadRequestException;
import com.dattci.rest_api.exeptionHandler.exceptions.EmptyNameException;
import com.dattci.rest_api.exeptionHandler.exceptions.ExistingAdminException;
import com.dattci.rest_api.exeptionHandler.exceptions.ExistingStudentException;
import com.dattci.rest_api.exeptionHandler.exceptions.NotAuthorizedException;
import com.dattci.rest_api.exeptionHandler.exceptions.NotFoundException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //400 - invalid input na bad request
    //HttpServletRequest, an object in java that represents the incoming http request sent by the user
    //like the one from Postman or browser.
    @ExceptionHandler(BadRequestException.class)
    //? = a wildcard in generics that makes the code flexible because it represents an unknown type.
    //it binds two completely different type of response depending on what happen at runtime.
    //acts as a placeholder for "a ResponseEntity containing an unknown object type" yet that could be a success 200 ok or an 404 not found error.
    public ResponseEntity<?> badRequestException(
            BadRequestException e,
            HttpServletRequest request) {

        //sets the status the bad request, 400
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse errorResponse = new ErrorResponse(
            //gets the date and time now
            LocalDateTime.now(),

            //gets the error code
            status.value(),

            //gets the reason of the error code
            status.getReasonPhrase(),

            //a descriptive message
            "You entered an invalid course id",

            //gets the endpoint, /api/...
            request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //400 - empty name na bad request
    @ExceptionHandler(EmptyNameException.class)
    public ResponseEntity<?> emptyNameException(
            EmptyNameException e,
            HttpServletRequest request) {

        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse errorResponse = new ErrorResponse(
            LocalDateTime.now(),
            status.value(),
            status.getReasonPhrase(),
            "Course name cannot be empty.",
            request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //400 - type mismatch na bad request
    //Handles the MethodArgumentTypeMismatchException, an exception that doesn't reach the controller
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> handleTypeMismatch(
            MethodArgumentTypeMismatchException e,
            HttpServletRequest request) {

        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse errorResponse = new ErrorResponse(
            LocalDateTime.now(),
            status.value(),
            status.getReasonPhrase(),
            "Numbers only, invalid course ID: " + e.getValue(),
            request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //404 - not found
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> notFoundException(
            NotFoundException e,
            HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorResponse errorResponse = new ErrorResponse(
            LocalDateTime.now(),
            status.value(),
            status.getReasonPhrase(), 
            "You entered a non-existing course id",
            request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //409, Duplicate Entries
    //for the 409, duplicate exception to work, the column 'name' or at least one column
    //must be unique so that the exception knows if it is a dup or not.
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> duplicateException(
            DataIntegrityViolationException e,
            HttpServletRequest request) {

        HttpStatus status = HttpStatus.CONFLICT;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                status.getReasonPhrase(),
                "Record already exist in the data base",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<?> authenticationException(
            AuthenticationException e,
            HttpServletRequest request) {

        HttpStatus status = HttpStatus.UNAUTHORIZED;

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                status.getReasonPhrase(),
                "Invalid Email or Password.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(response, status);
    }

    @ExceptionHandler(NotAuthorizedException.class)
    public ResponseEntity<?> notAuthorizedException(
            NotAuthorizedException e,
            HttpServletRequest request) {

        HttpStatus status = HttpStatus.FORBIDDEN; 

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                status.getReasonPhrase(),
                e.getLocalizedMessage(),
                request.getRequestURI()
        );
        return new ResponseEntity<>(response, status);
    }

    @ExceptionHandler(InsufficientAuthenticationException.class)
    public ResponseEntity<?> insufficientAuthenticationException(
        InsufficientAuthenticationException e,
        HttpServletRequest request) {

        HttpStatus status = HttpStatus.FORBIDDEN;

        ErrorResponse response = new ErrorResponse(
            LocalDateTime.now(),
            status.value(),
            status.getReasonPhrase(),
            "Access Denied: Not logged in.",
            request.getRequestURI()
        );

        return ResponseEntity.status(status).body(response);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<?> accessDeniedException(
        AccessDeniedException e,
        HttpServletRequest request) {

        HttpStatus status = HttpStatus.FORBIDDEN;

        ErrorResponse response = new ErrorResponse(
            LocalDateTime.now(),
            status.value(),
            status.getReasonPhrase(),
            "Access Denied: Needed higher role privilege.",
            request.getRequestURI()
        );

        return ResponseEntity.status(status).body(response);
    }

    @ExceptionHandler(ExistingStudentException.class)
    public ResponseEntity<?> handleExistingStudentException(ExistingStudentException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.CONFLICT;

        ErrorResponse response = new ErrorResponse(
            LocalDateTime.now(),
            status.value(),
            status.getReasonPhrase(),
            e.getMessage(),
            request.getRequestURI()
        );

        return ResponseEntity.status(status).body(response);
    }

    @ExceptionHandler(ExistingAdminException.class)
    public ResponseEntity<?> handleExistingAdminException(ExistingAdminException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.CONFLICT;

        ErrorResponse response = new ErrorResponse(
            LocalDateTime.now(),
            status.value(),
            status.getReasonPhrase(),
            e.getMessage(),
            request.getRequestURI()
        );

        return ResponseEntity.status(status).body(response);
    }    
}