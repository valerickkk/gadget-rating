package com.zurnachyan.gadratauth.repository;

import com.zurnachyan.gadratauth.model.business.GadRatUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<GadRatUser, Long> {

    Optional<GadRatUser> findUserCredentialsByUsername(String username);
}
