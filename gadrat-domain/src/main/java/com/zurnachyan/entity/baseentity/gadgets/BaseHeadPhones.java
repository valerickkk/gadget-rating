package com.zurnachyan.entity.baseentity.gadgets;

import com.zurnachyan.entity.abstractentity.AbstractGadget;
import com.zurnachyan.enums.GadgetType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Base headphones
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "t_headphones")
@NoArgsConstructor
public class BaseHeadPhones extends AbstractGadget {

    private GadgetType type = GadgetType.HEADPHONES;
}
