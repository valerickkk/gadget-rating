package com.zurnachyan.gadrat.entity.gadget;

import com.zurnachyan.gadrat.entity.abstractentity.AbstractGadget;
import com.zurnachyan.gadrat.enums.GadgetType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Base phone
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "t_phone")
@NoArgsConstructor
@AssociationOverride(name = "images", joinColumns = @JoinColumn(name = "fk_phone_id"))
public class BasePhone extends AbstractGadget {

    private GadgetType type = GadgetType.PHONE;
}
