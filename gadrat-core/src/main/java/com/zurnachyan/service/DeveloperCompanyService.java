package com.zurnachyan.service;

import com.zurnachyan.entity.baseentity.developers.BaseDeveloperCompany;
import com.zurnachyan.spring.repositories.DeveloperCompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class DeveloperCompanyService extends AbstractEntityService<BaseDeveloperCompany> {

    public DeveloperCompanyService(DeveloperCompanyRepository repository) {
        super(repository);
    }
}
