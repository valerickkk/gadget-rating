package com.zurnachyan.gadratgateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthValidationResponse {

    private String username;

    private List<String> authorities;
}
