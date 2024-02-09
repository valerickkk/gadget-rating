package com.zurnachyan.gadratauth.model;

import org.springframework.security.core.GrantedAuthority;

public enum UserAuthority implements GrantedAuthority {

    READ,

    WRITE;

    @Override
    public String getAuthority() {
        return null;
    }
}
