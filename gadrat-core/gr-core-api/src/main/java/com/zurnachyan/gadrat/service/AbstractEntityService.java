package com.zurnachyan.gadrat.service;

import com.zurnachyan.gadrat.exception.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Abstract entity service for work with entities
 * @param <C> entity type
 */
public abstract class AbstractEntityService<C> {

    /**
     * Spring entity repository
     */
    protected JpaRepository<C, Long> entityRepository;

    public AbstractEntityService(JpaRepository<C, Long> entityRepository) {
        this.entityRepository = entityRepository;
    }

    /**
     * Base method for finding entity by it`s id
     * @param id entity id
     * @return entity
     */
    public C getById(Long id) {
        return entityRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity with id: " + id + "is not found."));
    }

    /**
     * Base method for geting all entities of this type
     * @return list of entities
     */
    public List<C> getAll() {
        return entityRepository.findAll();
    }

    /**
     * Saves entity in database
     * @param entity entity
     * @return saved entity
     */
    protected C save(C entity) {
        return entityRepository.save(entity);
    }
}
