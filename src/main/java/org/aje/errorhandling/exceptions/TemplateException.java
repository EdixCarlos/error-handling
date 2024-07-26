package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class TemplateException extends CustomException {
    private final String message;
    public TemplateException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return this.message;
    }
    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
