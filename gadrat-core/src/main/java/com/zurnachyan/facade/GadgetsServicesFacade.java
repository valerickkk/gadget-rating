package com.zurnachyan.facade;

import com.zurnachyan.dto.GadgetDto;
import com.zurnachyan.enums.GadgetType;
import com.zurnachyan.service.AbstractGadgetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Set;

@Slf4j
@Component
@RequiredArgsConstructor
public class GadgetsServicesFacade {

    private final Set<AbstractGadgetService> services;

    /**
     * Saves gadget
     * @param gadgetDto gadget dto
     */
    public void saveGadget(GadgetDto gadgetDto) {
        GadgetType type = GadgetType.valueOf(gadgetDto.getType());
        services.stream()
                .filter(service -> service.getGadgetType().equals(type))
                .findAny()
                .ifPresent(service -> {
                    try {
                        service.saveGadget(gadgetDto);
                    } catch (IOException e) {
                        log.error(e.getMessage());
                    }
                });
    }
}
