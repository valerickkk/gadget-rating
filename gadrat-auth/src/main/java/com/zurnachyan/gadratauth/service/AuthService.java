package com.zurnachyan.gadratauth.service;

import com.zurnachyan.gadratauth.dto.RegisterRequestDto;
import com.zurnachyan.gadratauth.model.business.GadRatUser;
import com.zurnachyan.gadratauth.model.business.UserAuthority;
import com.zurnachyan.gadratauth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    /**
     * Create and register new user
     * @param registerDto user info from UI
     * @return message
     */
    public String registerNewUser(RegisterRequestDto registerDto) {
        GadRatUser user = new GadRatUser();
        user.setFirstName(registerDto.getFirstName());
        user.setLastName(registerDto.getLastName());
        user.setEmail(registerDto.getEmail());
        user.setUsername(registerDto.getUsername());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        user.getAuthorities().add(UserAuthority.READ);
        repository.save(user);
        String message = "User added to system!";
        log.info(message);
        return message;
    }

    public String generateToken(String username) {
        return jwtService.generateToken(username);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }
}
