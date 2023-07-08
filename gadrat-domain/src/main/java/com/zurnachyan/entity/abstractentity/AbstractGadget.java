package com.zurnachyan.entity.abstractentity;

import lombok.Data;

import javax.persistence.Id;

/**
 * Abstract gadget
 */
@Data
public abstract class AbstractGadget {

    /**
     * Gadget`s developer company
     */
    private AbstractDeveloperCompany company;

    /**
     * Gadget model
     */
    private String model;
}
