package com.zurnachyan.entity.baseentity.developers;

import com.zurnachyan.entity.abstractentity.AbstractDeveloperCompany;
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
public class BaseDeveloperCompany extends AbstractDeveloperCompany {

    /**
     * Developer`s ID
     */
    @Id
    private long id;
}
