package com.zurnachyan.entity.abstractentity;

import lombok.Data;

/**
 * Abstract gadget developer company
 */
@Data
public abstract class AbstractDeveloperCompany {

    /**
     * Company`s ID
     */
    private long id;

    /**
     * Company`s name
     */
    private String name;
}
