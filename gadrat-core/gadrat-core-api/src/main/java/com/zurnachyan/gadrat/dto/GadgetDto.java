package com.zurnachyan.gadrat.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Dto for received gadgets from frontend
 */
@Data
@NoArgsConstructor
public class GadgetDto {

    /**
     * Type of gadget
     */
    private String type;

    /**
     * Company id
     */
    private String companyId;

    /**
     * Model of gadget
     */
    private String model;

    /**
     * Collection of images of gadget
     */
    private List<MultipartFile> images;
}
