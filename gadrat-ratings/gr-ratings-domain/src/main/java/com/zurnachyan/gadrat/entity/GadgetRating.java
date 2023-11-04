package com.zurnachyan.gadrat.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class GadgetRating {

    @Id
    private long id;

    @Column
    private long gadgetId;

    @Column
    private float totalValue;

    @Column
    private float communityValue;

    @Column
    private float priceValue;
}
