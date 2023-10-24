package com.zurnachyan.service;

import com.zurnachyan.entity.baseentity.gadgets.BasePhone;
import com.zurnachyan.enums.GadgetType;
import com.zurnachyan.spring.repositories.PhoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService extends AbstractGadgetService<BasePhone> {

    public PhoneService(PhoneRepository repository,
                        DeveloperCompanyService companyService) {
        super(repository, companyService);
    }

    @Override
    public List<BasePhone> getAll() {
        return super.getAll();
    }

    @Override
    public GadgetType getGadgetType() {
        return GadgetType.PHONE;
    }
}
