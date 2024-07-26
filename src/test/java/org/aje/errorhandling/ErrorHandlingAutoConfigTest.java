package org.aje.errorhandling;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = ErrorHandlingAutoConfig.class)
class ErrorHandlingAutoConfigTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void applicationContextLoadsSuccessfully() {
        assertNotNull(context, "Application context should load without errors");
    }

    @Test
    void autoConfigClassIsRegisteredInApplicationContext() {
        assertTrue(context.containsBeanDefinition("errorHandlingAutoConfig"), "AutoConfig should be registered in the application context");
    }
}