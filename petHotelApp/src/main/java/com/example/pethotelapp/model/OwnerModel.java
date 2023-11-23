package com.example.pethotelapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class OwnerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    private String login;

    private String password;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL) //relacja 1 do wielu z AnimalModel, wlasciciel relacji
    private List<AnimalModel> animals;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL) //relacja 1 do wielu z ReservationModel, wlasciciel relacji
    private List<ReservationModel> reservations;

}
