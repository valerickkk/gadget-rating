package com.zurnachyan.gadrat.helper;

import com.zurnachyan.gadrat.entity.abstractentity.AbstractGadget;
import com.zurnachyan.gadrat.entity.baseentity.gadgets.BaseHeadPhones;
import com.zurnachyan.gadrat.entity.baseentity.gadgets.BasePhone;
import com.zurnachyan.gadrat.entity.baseentity.gadgets.BaseWatch;
import com.zurnachyan.gadrat.enums.GadgetType;

/**
 * Helper for product creation
 */
public class GadgetCreationHelper {

    /**
     * Creates gadget by provided gadget type
     * @param type type of gadget
     * @return created gadget
     */
    public static AbstractGadget createGadgetByType(GadgetType type) {
        AbstractGadget gadget;
        switch (type) {
            case PHONE -> gadget = new BasePhone();
            case WATCH -> gadget = new BaseWatch();
            case HEADPHONES -> gadget = new BaseHeadPhones();
            default -> gadget = null;
        }
        return gadget;
    }
}
