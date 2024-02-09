package com.zurnachyan.gadrat.entity.gadget;

import com.zurnachyan.gadrat.entity.abstractentity.AbstractGadget;
import com.zurnachyan.gadrat.enums.GadgetType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

/**
 * Base watch
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "t_watch")
@NoArgsConstructor
@AssociationOverride(name = "images", joinColumns = @JoinColumn(name = "fk_watch_id"))
public class BaseWatch extends AbstractGadget {

    private GadgetType type = GadgetType.WATCH;
}
