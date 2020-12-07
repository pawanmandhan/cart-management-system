package com.cart.exception;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(value = {IllegalArgumentException.class, IllegalStateException.class})
    public @ResponseBody String handleConflict(IllegalArgumentException ex) {
        return "This should be application specific";
    }

    @ExceptionHandler(value = {ConversionFailedException.class})
    public @ResponseBody String handleConflict2(ConversionFailedException ex) {
        return "This should be application specific 2";
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public @ResponseBody String handleConflict3(MethodArgumentNotValidException ex) {
        return "This should be application specific 3";
    }

    @ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
    public @ResponseBody String handleConflict4(MethodArgumentTypeMismatchException ex) {
        return "This should be application specific 4";
    }

}
