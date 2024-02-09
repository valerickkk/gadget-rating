package com.zurnachyan.gadratauth.controller;

import com.zurnachyan.gadratauth.dto.AuthRequestDto;
import com.zurnachyan.gadratauth.dto.RegisterRequestDto;
import com.zurnachyan.gadratauth.dto.UserDto;
import com.zurnachyan.gadratauth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequestDto registerDto) {
        service.registerNewUser(registerDto);
        return ResponseEntity.created(URI.create("/login/")).build();
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody AuthRequestDto requestDto) {
        UserDto user = service.loginUser(requestDto);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam(name = "token") String token) {
        service.validateToken(token);
        return "Valid token";
    }
}
