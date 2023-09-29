package com.zurnachyan.entity.baseentity.gadgets;

import com.zurnachyan.entity.abstractentity.AbstractGadget;
import com.zurnachyan.enums.GadgetType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Base watch
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "t_watch")
@NoArgsConstructor
public class BaseWatch extends AbstractGadget {

    private GadgetType type = GadgetType.WATCH;
}
