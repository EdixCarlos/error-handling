package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class ConstraintViolationException extends CustomException {
    public ConstraintViolationException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "A constraint violation occurred.";
    }
}
