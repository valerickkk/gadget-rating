package com.zurnachyan.gadrat.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserEstimate {

    @Id
    private long id;

    @Column
    private long gadgetId;

    @Column
    private float value;
}
