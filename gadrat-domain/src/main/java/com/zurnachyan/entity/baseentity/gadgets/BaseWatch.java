package com.zurnachyan.entity.baseentity.gadgets;

import com.zurnachyan.entity.abstractentity.AbstractGadget;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * Base watch
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
public class BaseWatch extends AbstractGadget {

}