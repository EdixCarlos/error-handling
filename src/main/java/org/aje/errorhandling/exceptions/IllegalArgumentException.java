package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class IllegalArgumentException extends CustomException {
    public IllegalArgumentException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "Illegal argument provided.";
    }
}
