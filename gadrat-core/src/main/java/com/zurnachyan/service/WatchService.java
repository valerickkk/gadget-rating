package com.zurnachyan.service;

import com.zurnachyan.entity.baseentity.gadgets.BaseWatch;
import com.zurnachyan.spring.repositories.WatchRepository;
import org.springframework.stereotype.Service;

@Service
public class WatchService extends AbstractEntityService<BaseWatch> {

    public WatchService(WatchRepository repository) {
        super(repository);
    }
}
