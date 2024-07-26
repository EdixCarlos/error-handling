package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class RestClientException extends CustomException {
    public RestClientException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getErrorDescription() {
        return "Error occurred during REST client operation.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
