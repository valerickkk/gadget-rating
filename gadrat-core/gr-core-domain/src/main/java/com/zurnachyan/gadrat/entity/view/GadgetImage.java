package com.zurnachyan.gadrat.entity.view;

import com.zurnachyan.gadrat.entity.abstractentity.AbstractImage;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_gadget_image")
public class GadgetImage extends AbstractImage {

    @Column(name = "c_main")
    private boolean isMain;
}
