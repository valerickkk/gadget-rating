package com.zurnachyan.gadrat.spring.repositories;

import com.zurnachyan.gadrat.entity.baseentity.gadgets.BasePhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<BasePhone, Long> {
}
