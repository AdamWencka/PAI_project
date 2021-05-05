package com.example.Car_rental_PAI_project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_Id;
    private String name;
    private String surname;
    private String email;
    private String address;
    @OneToMany
    private List<Reservation> reservations;

    public Client(String name, String surname, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }
}
