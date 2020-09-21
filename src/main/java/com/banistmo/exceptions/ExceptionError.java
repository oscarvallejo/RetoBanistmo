package com.banistmo.exceptions;

public class ExceptionError extends AssertionError {

    public ExceptionError(String message, Throwable cause) {
        super(message, cause);
    }

}
