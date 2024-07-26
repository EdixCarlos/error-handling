package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class NullPointerException extends CustomException {
    public NullPointerException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getErrorDescription() {
        return "Null pointer accessed.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
