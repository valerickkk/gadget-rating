package com.zurnachyan.entity.abstractentity;

import com.zurnachyan.entity.baseentity.developers.BaseDeveloperCompany;
import lombok.Data;

import javax.persistence.*;

/**
 * Abstract gadget
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractGadget {

    /**
     * Gadget`s id
     */
    @Id
    private long id;

    /**
     * Gadget`s developer company
     */
    @OneToOne
    private BaseDeveloperCompany company;

    /**
     * Gadget model
     */
    @Column
    private String model;
}
