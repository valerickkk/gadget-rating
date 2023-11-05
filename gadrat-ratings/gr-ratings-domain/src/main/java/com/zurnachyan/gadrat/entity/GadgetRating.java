package com.zurnachyan.gadrat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_gadget_rating")
@NoArgsConstructor
public class GadgetRating {

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "c_gadget_id")
    private long gadgetId;

    @Column(name = "c_total_value")
    private float totalValue;

    @Column(name = "c_community_value")
    private float communityValue;

    @Column(name = "c_price_value")
    private float priceValue;
}
