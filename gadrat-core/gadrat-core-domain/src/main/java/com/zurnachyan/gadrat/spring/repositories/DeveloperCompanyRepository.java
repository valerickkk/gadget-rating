package com.zurnachyan.gadrat.spring.repositories;

import com.zurnachyan.gadrat.entity.baseentity.developers.BaseDeveloperCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperCompanyRepository extends JpaRepository<BaseDeveloperCompany, Long> {
}
