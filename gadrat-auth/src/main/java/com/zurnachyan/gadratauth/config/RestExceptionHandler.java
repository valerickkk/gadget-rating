package com.zurnachyan.gadratauth.config;

import com.zurnachyan.gadratauth.exception.AuthenticationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class RestExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = AuthenticationException.class)
    public ResponseEntity<String> handleUsernameNotFoundException(AuthenticationException exception) {
        log.error("An error occurred: " + exception.getMessage());
        return ResponseEntity.status(exception.getStatus()).body(exception.getMessage());
    }
}
