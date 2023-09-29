package com.zurnachyan.service;

import com.zurnachyan.entity.baseentity.gadgets.BaseHeadPhones;
import com.zurnachyan.spring.repositories.HeadPhonesRepository;
import org.springframework.stereotype.Service;

@Service
public class HeadPhonesService extends AbstractEntityService<BaseHeadPhones> {

    public HeadPhonesService(HeadPhonesRepository repository) {
        super(repository);
    }
}
