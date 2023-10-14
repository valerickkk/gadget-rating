package com.zurnachyan.entity.abstractentity;

import com.zurnachyan.entity.baseentity.developers.BaseDeveloperCompany;
import com.zurnachyan.entity.view.Image;
import com.zurnachyan.enums.GadgetType;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract gadget
 */
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class AbstractGadget {

    /**
     * Gadget`s id
     */
    @Id
    @Column(name = "c_id")
    private long id;

    /**
     * Gadget`s developer company
     */
    @ManyToOne
    @JoinColumn(name = "fk_company_id")
    private BaseDeveloperCompany company;

    /**
     * Gadget model
     */
    @Column(name = "c_model")
    private String model;

    /**
     * Gadget images
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Image> images = new ArrayList<>();

    /**
     * Gadget type
     */
    @Column(name = "c_type")
    @Enumerated(EnumType.STRING)
    protected GadgetType type;
}
