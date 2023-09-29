package com.zurnachyan.entity.baseentity.gadgets;

import com.zurnachyan.entity.abstractentity.AbstractGadget;
import com.zurnachyan.enums.GadgetType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Base phone
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "t_phone")
@NoArgsConstructor
public class BasePhone extends AbstractGadget {

    private GadgetType type = GadgetType.PHONE;
}
