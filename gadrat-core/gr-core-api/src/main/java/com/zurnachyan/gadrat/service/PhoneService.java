package com.zurnachyan.gadrat.service;

import com.zurnachyan.gadrat.entity.gadget.BasePhone;
import com.zurnachyan.gadrat.enums.GadgetType;
import com.zurnachyan.gadrat.spring.repositories.PhoneRepository;
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
