package com.zurnachyan.gadrat.entity.baseentity.developers;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Company`s name
     */
    @Column(name = "c_name")
    private String name;
}
