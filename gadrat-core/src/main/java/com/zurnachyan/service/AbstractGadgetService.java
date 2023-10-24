package com.zurnachyan.service;

import com.zurnachyan.dto.GadgetDto;
import com.zurnachyan.entity.abstractentity.AbstractGadget;
import com.zurnachyan.entity.view.Image;
import com.zurnachyan.enums.GadgetType;
import com.zurnachyan.helper.GadgetCreationHelper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Abstract gadgets service
 * @param <C> Gadget class
 */
public abstract class AbstractGadgetService<C extends AbstractGadget> extends AbstractEntityService<C> {

    private final DeveloperCompanyService companyService;

    public AbstractGadgetService(JpaRepository<C, Long> entityRepository,
                                 DeveloperCompanyService companyService) {
        super(entityRepository);
        this.companyService = companyService;
    }

    /**
     * Saves entity in database
     * @param gadgetDto dto from frontend
     * @return saved entity
     */
    public C saveGadget(GadgetDto gadgetDto) throws IOException {
        GadgetType type = GadgetType.valueOf(gadgetDto.getType());
        AbstractGadget newGadget = GadgetCreationHelper.createGadgetByType(type);
        newGadget.setCompany(companyService.getById(Long.valueOf(gadgetDto.getCompanyId())));
        newGadget.setModel(gadgetDto.getModel());
        for (MultipartFile img : gadgetDto.getImages()) {
            Image image = new Image();
            image.setName(img.getOriginalFilename());
            image.setSize(img.getSize());
            image.setContent(img.getBytes());
            newGadget.getImages().add(image);
        }
        return save((C) newGadget);
    }

    /**
     * Type of gadget that handled by this service
     * @return type
     */
    public abstract GadgetType getGadgetType();
}
