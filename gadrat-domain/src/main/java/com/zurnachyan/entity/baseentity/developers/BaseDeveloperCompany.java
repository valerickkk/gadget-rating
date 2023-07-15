package com.zurnachyan.entity.baseentity.developers;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Base gadget developer company
 */
@Data
@Entity
@NoArgsConstructor
public class BaseDeveloperCompany {
    /**
     * Company`s ID
     */
    @Id
    private long id;

    /**
     * Company`s name
     */
    private String name;
}
