package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class IllegalStateException extends CustomException {
    public IllegalStateException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getErrorDescription() {
        return "The application is in an illegal state.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
