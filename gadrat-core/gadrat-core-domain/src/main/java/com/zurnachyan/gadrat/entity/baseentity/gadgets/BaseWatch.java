package com.zurnachyan.gadrat.entity.baseentity.gadgets;

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
