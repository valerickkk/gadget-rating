package com.zurnachyan.gadratauth.service;

import com.zurnachyan.gadratauth.exception.AuthenticationException;
import com.zurnachyan.gadratauth.model.GadRatUser;
import com.zurnachyan.gadratauth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GadratUserManager {

    private final UserRepository repository;

    public GadRatUser getUserByUsername(String username) throws UsernameNotFoundException {
         return repository.findUserByUsername(username)
                 .orElseThrow(() -> new AuthenticationException("Username not found!", HttpStatus.NOT_FOUND));
    }

    public void saveUser(GadRatUser user) {
        repository.save(user);
    }

    public void deleteUser(String username) {
        repository.deleteByUsername(username);
    }

    public boolean userExists(String username) {
        return repository.findUserByUsername(username).isPresent();
    }
}
