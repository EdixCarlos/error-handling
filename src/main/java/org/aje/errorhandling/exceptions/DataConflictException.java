package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class DataConflictException extends CustomException {
    public DataConflictException() {
        super("Data conflict occurred");
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.CONFLICT;
    }

    @Override
    public String getErrorDescription() {
        return "There is a conflict with the existing data.";
    }
    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
