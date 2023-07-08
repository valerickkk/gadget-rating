package com.zurnachyan.spring.repositories;

import com.zurnachyan.entity.baseentity.gadgets.BasePhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<BasePhone, Long> {
}
