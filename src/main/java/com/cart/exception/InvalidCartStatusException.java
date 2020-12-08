package com.cart.exception;

//@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class InvalidCartStatusException extends RuntimeException {

    public InvalidCartStatusException() {
    }

    public InvalidCartStatusException(String message) {
        super(message);
    }

    public InvalidCartStatusException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCartStatusException(Throwable cause) {
        super(cause);
    }

    public InvalidCartStatusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
