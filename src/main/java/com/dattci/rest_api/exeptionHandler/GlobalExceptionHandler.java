package com.dattci.rest_api.exeptionHandler;

import com.batch1_springboot.demo.exeptionHandler.exceptions.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    //400 - Manual throw.
    @ExceptionHandler(BadRequestException.class)
    //? = a wildcard in generics that makes the code flexible because it represents an unknown type.
    //it binds two completely different type of response depending on what happen at runtime.
    //acts as a placeholder for "a ResponseEntity containing an unknown object type" yet, that could be a success 200 ok or an 404 not found error.
    public ResponseEntity<?> badRequestException(
            BadRequestException e,
            HttpServletRequest request){ //HttpServletRequest - to get the path later on. Ex: /api/...

        //sets the status the bad request, 400
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse errorResponse = new ErrorResponse(
                //gets the date and time now
                LocalDateTime.now(),

                //gets the error code
                status.value(),

                //gets the reason of the error code
                e.getMessage(),

                //a descriptive message
                "You entered an invalid course id.",

                //gets the endpoint, /api/...
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //400 - invalid input na bad request. For POST
    @ExceptionHandler(NullInputException.class)
    public ResponseEntity<?> nullInputException(
            NullInputException e,
            HttpServletRequest request){

        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "The required parameter cannot be empty.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //400 - type mismatch na bad request. For GET
    //Handles the MethodArgumentTypeMismatchException, an exception that doesn't reach the controller
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> typeMismatchException(
            MethodArgumentTypeMismatchException e,
            HttpServletRequest request){

        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "You entered an invalid parameter or field.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //400 - for when @Valid fails. Needs the necessary annotations and the @Valid itself in the DTOs.
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(
            MethodArgumentNotValidException e,
            HttpServletRequest request){
        
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "An argument is missing.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //401 -  For Login, unauthorized exception when entering invalid or incorrect password or email.
    @ExceptionHandler(BadCredentialException.class)
    public ResponseEntity<?> badCredentialException(
            BadCredentialException e,
            HttpServletRequest request){
        
        HttpStatus status = HttpStatus.UNAUTHORIZED;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "Invalid email or password.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //404 - not found. For GET
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> notFoundException(
            NotFoundException e,
            HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "The required parameter or field is missing.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //404 - For get, when a lingering slash (/) on a correct path. Ex: /api/courses/  <- lingering slash.
    @ExceptionHandler(HandleMissingException.class)
    public ResponseEntity<?> handleMissingException(
            HandleMissingException e,
            HttpServletRequest request){
        
        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "End point cannot be empty, please provide the required ID.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }


    //404 - not existing endpoint. For path.
    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<?> noResourceFoundException(
            NoResourceFoundException e,
            HttpServletRequest request){
        
        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "The end point doesn't exist. Check for a typo or something missing.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //409 - Duplicate Entries. For POST.
    //for the 409, duplicate exception to work, the column 'name' or at least one column
    //must be unique so that the exception knows if it is a dup or not.
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> dataIntegrityViolationException(
            DataIntegrityViolationException e,
            HttpServletRequest request){

        HttpStatus status = HttpStatus.CONFLICT;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "Record already exist in the data base.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //500 - when database connection encountered an error. Under the DataAccessException Hierarchy along with 409.
    @ExceptionHandler(DataAccessResourceFailureException.class)
    public ResponseEntity<?> databaseConnectionException(
            DataAccessResourceFailureException e,
            HttpServletRequest request){
        
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "An error occurred. It's not us, it's the database.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }

    //500 - For an unexpected error.
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> unknownException(
            RuntimeException e,
            HttpServletRequest request){
        
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                "An error occurred. It's not you, it's me.",
                request.getRequestURI()
        );
        return new ResponseEntity<>(errorResponse, status);
    }
}
