package com.zurnachyan.gadrat.entity.view;


import com.zurnachyan.gadrat.entity.abstractentity.AbstractImage;
import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "t_user_image")
public class UserImage extends AbstractImage {

}
