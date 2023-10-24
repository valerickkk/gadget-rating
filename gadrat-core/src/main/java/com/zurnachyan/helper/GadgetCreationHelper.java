package com.zurnachyan.helper;

import com.zurnachyan.entity.abstractentity.AbstractGadget;
import com.zurnachyan.entity.baseentity.gadgets.BaseHeadPhones;
import com.zurnachyan.entity.baseentity.gadgets.BasePhone;
import com.zurnachyan.entity.baseentity.gadgets.BaseWatch;
import com.zurnachyan.enums.GadgetType;

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
