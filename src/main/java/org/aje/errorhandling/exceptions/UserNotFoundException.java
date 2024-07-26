package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends CustomException {
    public UserNotFoundException() {
        super("User not found");
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public String getErrorDescription() {
        return "The requested user does not exist.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
