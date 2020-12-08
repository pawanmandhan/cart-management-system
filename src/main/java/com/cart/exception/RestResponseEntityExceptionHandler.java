package com.cart.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    // handler on cart status invalid
    @ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
    public @ResponseBody
    String handleInvalidCartStatus(MethodArgumentTypeMismatchException ex) {
        return "Invalid Status: Please provide a valid status in the path variable";
    }

}
