package com.zurnachyan.gadratauth.dto;

import lombok.Data;

/**
 * DTO for new user registration
 */
@Data
public class RegisterRequestDto {

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;
}
