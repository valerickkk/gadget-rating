package com.zurnachyan.gadrat.entity.abstractentity;

import lombok.Data;

import jakarta.persistence.*;

/**
 * Abstract class for images
 */
@Data
@MappedSuperclass
public abstract class AbstractImage {

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "c_name")
    private String name;

    @Column(name = "c_size")
    private long size;

    @Lob
    @Column(name = "c_content")
    private byte[] content;
}
