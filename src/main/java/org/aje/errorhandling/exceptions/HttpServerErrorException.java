package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class HttpServerErrorException extends CustomException {
    public HttpServerErrorException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getErrorDescription() {
        return "The server encountered an unexpected condition which prevented it from fulfilling the request.";
    }
}
