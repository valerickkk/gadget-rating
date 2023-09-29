package com.zurnachyan.exception;

/**
 * Exception that is thrown when some entity is not found in database
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }
}
