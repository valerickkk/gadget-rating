package com.zurnachyan.service;

import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractEntityService<C, I> {

    private JpaRepository<C, I> entityRepository;

    public C getById(I id) {
        return entityRepository.getById(id);
    }
}
