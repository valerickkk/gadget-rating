package com.zurnachyan.gadrat.spring.repositories;

import com.zurnachyan.gadrat.entity.gadget.BasePhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<BasePhone, Long> {
}
