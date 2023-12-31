package com.zurnachyan.entity.view;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_image")
public class Image {

    @Id
    @Column(name = "c_id")
    private long id;

    @Column(name = "c_name")
    private String name;

    @Column(name = "c_main")
    private boolean isMain;

    @Lob
    @Column(name = "c_content")
    private byte[] content;
}
