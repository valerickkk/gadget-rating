package com.zurnachyan.entity.baseentity.gadgets;

import com.zurnachyan.entity.abstractentity.AbstractGadget;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Base headphones
 */
@Data
@Entity
@NoArgsConstructor
public class BaseHeadPhones extends AbstractGadget {

    /**
     * Gadget`s ID
     */
    @Id
    private long id;
}
