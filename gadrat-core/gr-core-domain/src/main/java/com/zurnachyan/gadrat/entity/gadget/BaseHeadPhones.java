package com.zurnachyan.gadrat.entity.gadget;

import com.zurnachyan.gadrat.entity.abstractentity.AbstractGadget;
import com.zurnachyan.gadrat.enums.GadgetType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.AssociationOverride;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * Base headphones
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "t_headphones")
@NoArgsConstructor
@AssociationOverride(name = "images", joinColumns = @JoinColumn(name = "fk_headphones_id"))
public class BaseHeadPhones extends AbstractGadget {

    private GadgetType type = GadgetType.HEADPHONES;
}
