package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class OptimisticLockingFailureException extends CustomException {
    public OptimisticLockingFailureException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.CONFLICT;
    }

    @Override
    public String getErrorDescription() {
        return "A conflict occurred due to optimistic locking failure.";
    }
}
