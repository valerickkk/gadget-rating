package com.zurnachyan.gadrat.service;

import com.zurnachyan.gadrat.entity.baseentity.gadgets.BaseHeadPhones;
import com.zurnachyan.gadrat.enums.GadgetType;
import com.zurnachyan.gadrat.spring.repositories.HeadPhonesRepository;
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
