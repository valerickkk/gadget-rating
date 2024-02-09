package com.zurnachyan.gadratauth.service;

import com.zurnachyan.gadratauth.dto.AuthRequestDto;
import com.zurnachyan.gadratauth.dto.RegisterRequestDto;
import com.zurnachyan.gadratauth.dto.UserDto;
import com.zurnachyan.gadratauth.exception.AuthenticationException;
import com.zurnachyan.gadratauth.mapper.UserMapper;
import com.zurnachyan.gadratauth.model.GadRatUser;
import com.zurnachyan.gadratauth.model.UserAuthority;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {

    private final GadratUserManager userManager;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    /**
     * Create and register new user
     *
     * @param registerDto user info from UI
     */
    public void registerNewUser(RegisterRequestDto registerDto) {
        GadRatUser user = new GadRatUser();
        user.setFirstName(registerDto.getFirstName());
        user.setLastName(registerDto.getLastName());
        user.setEmail(registerDto.getEmail());
        user.setUsername(registerDto.getUsername());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        user.getAuthorities().add(UserAuthority.READ);
        userManager.saveUser(user);
        log.info("User added to system!");
    }

    public UserDto loginUser(AuthRequestDto requestDto) {
        GadRatUser user = userManager.getUserByUsername(requestDto.getUsername());
        if (passwordEncoder.matches(requestDto.getPassword(), user.getPassword())) {
            UserDto dto = userMapper.userToDto(user);
            dto.setToken(jwtService.generateToken(user.getUsername()));
            log.info("User successfully logged in!");
            return dto;
        }
        throw new AuthenticationException("Wrong password!", HttpStatus.BAD_REQUEST);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }
}
