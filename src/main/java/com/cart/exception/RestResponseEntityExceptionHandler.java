package com.cart.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

//    @ExceptionHandler(value = {IllegalArgumentException.class, IllegalStateException.class})
//    public @ResponseBody String handleConflict(IllegalArgumentException ex) {
//        return "This should be application specific";
//    }
//
//    @ExceptionHandler(value = {ConversionFailedException.class})
//    public @ResponseBody String handleConflict2(ConversionFailedException ex) {
//        return "This should be application specific 2";
//    }
//
//    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
//    public @ResponseBody String handleConflict3(MethodArgumentNotValidException ex) {
//        return "This should be application specific 3";
//    }

    // handler on cart status invalid
    @ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
    public @ResponseBody String handleInvalidCartStatus(MethodArgumentTypeMismatchException ex) {
        return "Invalid Status: Please provide a valid status in the path variable";
    }

}
