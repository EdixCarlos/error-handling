package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class SQLException extends CustomException {
    public SQLException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getErrorDescription() {
        return "A SQL error has occurred.";
    }
}
