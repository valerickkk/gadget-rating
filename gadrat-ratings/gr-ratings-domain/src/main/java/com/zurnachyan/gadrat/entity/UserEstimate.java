package com.zurnachyan.gadrat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_user_estimate")
@NoArgsConstructor
public class UserEstimate {

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "c_gadget_id")
    private long gadgetId;

    @Column(name = "c_value")
    private float value;
}
