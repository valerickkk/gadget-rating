package com.zurnachyan.gadrat.entity.abstractentity;

import com.zurnachyan.gadrat.entity.developers.BaseDeveloperCompany;
import com.zurnachyan.gadrat.entity.view.GadgetImage;
import com.zurnachyan.gadrat.enums.GadgetType;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract gadget
 */
@Data
@MappedSuperclass
public abstract class AbstractGadget {

    /**
     * Gadget`s id
     */
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private List<GadgetImage> images = new ArrayList<>();

    /**
     * Gadget type
     */
    @Column(name = "c_type")
    @Enumerated(EnumType.STRING)
    protected GadgetType type;
}
