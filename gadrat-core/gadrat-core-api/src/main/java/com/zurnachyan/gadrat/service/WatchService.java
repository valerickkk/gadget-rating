package com.zurnachyan.gadrat.service;

import com.zurnachyan.gadrat.entity.baseentity.gadgets.BaseWatch;
import com.zurnachyan.gadrat.enums.GadgetType;
import com.zurnachyan.gadrat.spring.repositories.WatchRepository;
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
