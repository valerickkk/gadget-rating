package com.zurnachyan.service;

import com.zurnachyan.entity.baseentity.gadgets.BasePhone;
import com.zurnachyan.spring.repositories.PhoneRepository;
import org.springframework.stereotype.Service;

@Service
public class PhoneService extends AbstractEntityService<BasePhone> {

    public PhoneService(PhoneRepository repository) {
        super(repository);
    }
}
