package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class AccessDeniedException extends CustomException {
    public AccessDeniedException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.FORBIDDEN;
    }

    @Override
    public String getErrorDescription() {
        return "Access is denied.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
