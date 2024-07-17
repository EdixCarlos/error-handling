package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class MissingServletRequestParameterException extends CustomException {
    public MissingServletRequestParameterException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "Required parameter is missing in the request.";
    }
}
