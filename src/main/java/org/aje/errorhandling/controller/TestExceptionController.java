package org.aje.errorhandling.controller;

import org.aje.errorhandling.exceptions.*;
import org.aje.errorhandling.exceptions.IllegalStateException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestExceptionController {

    @GetMapping("/test/exception/{type}")
    public void generateException(@PathVariable String type) {
        switch (type) {
            case "badRequest":
                throw new BadRequestException("This is a bad request test exception.");
            case "notFound":
                throw new UserNotFoundException();
            case "internal":
                throw new HttpServerErrorException("This is an internal server error test exception.");
            case "timeout":
                throw new HttpTimeoutException("This is a timeout test exception.");
            default:
                throw new IllegalStateException("Test exception type not supported: " + type);
        }
    }
}