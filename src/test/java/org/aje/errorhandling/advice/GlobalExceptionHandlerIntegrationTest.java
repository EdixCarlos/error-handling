package org.aje.errorhandling.advice;

import org.aje.errorhandling.AutoConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.aje.errorhandling.controller.TestExceptionController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TestExceptionController.class)
@Import(GlobalExceptionHandler.class)
@ContextConfiguration(classes = AutoConfig.class)
public class GlobalExceptionHandlerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testBadRequestException() throws Exception {
        mockMvc.perform(get("/test/exception/badRequest"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("The request could not be understood by the server due to malformed syntax."))
                .andExpect(jsonPath("$.status").value(400));
    }

    @Test
    public void testUserNotFoundException() throws Exception {
        mockMvc.perform(get("/test/exception/notFound"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.error").value("The requested user does not exist."))
                .andExpect(jsonPath("$.status").value(404));
    }

    @Test
    public void testHttpServerErrorException() throws Exception {
        mockMvc.perform(get("/test/exception/internal"))
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.error").value("The server encountered an unexpected condition which prevented it from fulfilling the request."))
                .andExpect(jsonPath("$.status").value(500));
    }

    @Test
    public void testHttpTimeoutException() throws Exception {
        mockMvc.perform(get("/test/exception/timeout"))
                .andExpect(status().isGatewayTimeout())
                .andExpect(jsonPath("$.error").value("The HTTP request timed out."))
                .andExpect(jsonPath("$.status").value(504));
    }

}