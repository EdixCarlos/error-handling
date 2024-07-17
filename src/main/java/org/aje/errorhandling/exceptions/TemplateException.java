package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class TemplateException extends CustomException {
    public TemplateException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "Description of the specific error.";
    }
}
