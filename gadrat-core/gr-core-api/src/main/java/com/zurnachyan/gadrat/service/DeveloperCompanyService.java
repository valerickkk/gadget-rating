package com.zurnachyan.gadrat.service;

import com.zurnachyan.gadrat.entity.developers.BaseDeveloperCompany;
import com.zurnachyan.gadrat.spring.repositories.DeveloperCompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class DeveloperCompanyService extends AbstractEntityService<BaseDeveloperCompany> {

    public DeveloperCompanyService(DeveloperCompanyRepository repository) {
        super(repository);
    }
}
