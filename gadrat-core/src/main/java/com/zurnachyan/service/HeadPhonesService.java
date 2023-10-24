package com.zurnachyan.service;

import com.zurnachyan.entity.baseentity.gadgets.BaseHeadPhones;
import com.zurnachyan.enums.GadgetType;
import com.zurnachyan.spring.repositories.HeadPhonesRepository;
import org.springframework.stereotype.Service;

@Service
public class HeadPhonesService extends AbstractGadgetService<BaseHeadPhones> {

    public HeadPhonesService(HeadPhonesRepository repository,
                             DeveloperCompanyService companyService) {
        super(repository, companyService);
    }

    @Override
    public GadgetType getGadgetType() {
        return GadgetType.HEADPHONES;
    }
}
