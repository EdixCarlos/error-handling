package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class NoDataFoundException extends CustomException {

    public NoDataFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public String getErrorDescription() {
        return "No data found.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
