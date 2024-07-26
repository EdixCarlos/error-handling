package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class TimestampException extends CustomException {
    public TimestampException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.REQUEST_TIMEOUT;
    }

    @Override
    public String getErrorDescription() {
        return "Error related to timestamp processing.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}