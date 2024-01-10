package com.zurnachyan.gadrat.entity.view;


import com.zurnachyan.gadrat.entity.abstractentity.AbstractImage;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_user_image")
public class UserImage extends AbstractImage {

}
