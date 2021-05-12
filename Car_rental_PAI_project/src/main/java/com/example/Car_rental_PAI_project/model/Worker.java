package com.example.Car_rental_PAI_project.model;

import com.example.Car_rental_PAI_project.model.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long worker_Id;
    private String name;
    private String surname;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_assigned", nullable =false)
    @JsonIgnoreProperties({"listOfWorkers"})
    private Department currDepartment;
    @OneToMany(mappedBy = "worker")
    @JsonIgnoreProperties({"worker"})
    private List<Reservation> reservations;

    public Worker() {
    }

    public Worker(String name, String surname, Role role, Department currDepartment) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.currDepartment = currDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Department getCurrDepartment() {
        return currDepartment;
    }

    public void setCurrDepartment(Department currDepartment) {
        this.currDepartment = currDepartment;
    }
}
