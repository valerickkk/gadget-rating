package com.zurnachyan.service;

import com.zurnachyan.entity.baseentity.gadgets.BaseWatch;
import com.zurnachyan.enums.GadgetType;
import com.zurnachyan.spring.repositories.WatchRepository;
import org.springframework.stereotype.Service;

@Service
public class WatchService extends AbstractGadgetService<BaseWatch> {

    public WatchService(WatchRepository repository,
                        DeveloperCompanyService companyService) {
        super(repository, companyService);
    }

    @Override
    public GadgetType getGadgetType() {
        return GadgetType.WATCH;
    }
}
