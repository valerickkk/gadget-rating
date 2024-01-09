package com.zurnachyan.gadratauth.controller;

import com.zurnachyan.gadratauth.dto.AuthRequestDto;
import com.zurnachyan.gadratauth.dto.RegisterRequestDto;
import com.zurnachyan.gadratauth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService service;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public String addNewUser(@RequestBody RegisterRequestDto registerDto) {
        return service.registerNewUser(registerDto);
    }

    @PostMapping("/login")
    public String getToken(@RequestBody AuthRequestDto requestDto) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(requestDto.getUsername(), requestDto.getPassword()));
        if (authenticate.isAuthenticated()) {
            return service.generateToken(requestDto.getUsername());
        } else {
            throw new RuntimeException("User is not exist!");
        }
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam(name = "token") String token) {
        service.validateToken(token);
        return "Valid token";
    }
}
