package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class IOException extends CustomException {
    public IOException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getErrorDescription() {
        return "An I/O error has occurred.";
    }
}
