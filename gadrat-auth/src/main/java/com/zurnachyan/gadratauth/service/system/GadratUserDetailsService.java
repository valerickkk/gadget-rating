package com.zurnachyan.gadratauth.service.system;

import com.zurnachyan.gadratauth.model.system.SystemUserDetails;
import com.zurnachyan.gadratauth.model.business.GadRatUser;
import com.zurnachyan.gadratauth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

@RequiredArgsConstructor
public class GadratUserDetailsService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<GadRatUser> userCredentials = repository.findUserCredentialsByUsername(username);
        return userCredentials
                .map(SystemUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found!"));
    }
}
