package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class DataIntegrityViolationException extends CustomException {
    public DataIntegrityViolationException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.CONFLICT;
    }

    @Override
    public String getErrorDescription() {
        return "Data integrity violation has occurred.";
    }
}
