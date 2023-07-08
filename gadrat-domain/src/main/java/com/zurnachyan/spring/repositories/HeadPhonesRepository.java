package com.zurnachyan.spring.repositories;

import com.zurnachyan.entity.baseentity.gadgets.BaseHeadPhones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeadPhonesRepository extends JpaRepository<BaseHeadPhones, Long> {
}
