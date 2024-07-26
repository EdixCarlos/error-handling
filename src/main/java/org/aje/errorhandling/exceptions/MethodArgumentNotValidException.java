package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class MethodArgumentNotValidException extends CustomException {
    public MethodArgumentNotValidException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "Method argument is not valid; validation failed.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
