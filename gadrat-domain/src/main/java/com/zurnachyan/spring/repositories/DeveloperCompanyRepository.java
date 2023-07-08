package com.zurnachyan.spring.repositories;

import com.zurnachyan.entity.baseentity.developers.BaseDeveloperCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperCompanyRepository extends JpaRepository<BaseDeveloperCompany, Long> {
}
