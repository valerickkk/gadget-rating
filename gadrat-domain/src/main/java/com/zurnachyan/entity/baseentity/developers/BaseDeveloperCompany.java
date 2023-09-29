package com.zurnachyan.entity.baseentity.developers;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Base gadget developer company
 */
@Data
@Entity
@Table(name = "t_developer_company")
@NoArgsConstructor
public class BaseDeveloperCompany {
    /**
     * Company`s ID
     */
    @Id
    @Column(name = "c_id")
    private long id;

    /**
     * Company`s name
     */
    @Column(name = "c_name")
    private String name;
}
