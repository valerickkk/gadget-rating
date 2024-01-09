package com.zurnachyan.gadratauth.model.business;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "t_user_creds")
@NoArgsConstructor
public class GadRatUser {

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "c_username")
    private String username;

    @Column(name = "c_password")
    private String password;

    @Column(name = "c_firstname")
    private String firstName;

    @Column(name = "c_lastname")
    private String lastName;

    @Column(name = "c_email")
    private String email;

    @Enumerated(value = EnumType.STRING)
    @ElementCollection
    @CollectionTable(name = "t_authorities", joinColumns = @JoinColumn(name = "fk_user_id"))
    private List<UserAuthority> authorities = new ArrayList<>();
}
