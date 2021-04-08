package com.example.Car_rental_PAI_project.model.enums;

import lombok.Getter;

@Getter
public enum Status {
    RENTED("WYPOŻYCZONY"),
    AVAILABLE("DOSTĘPNY"),
    UNOBTAINABLE("NIEDOSTĘPNY");

    private final String statusName;
    Status(String statusName) {
        this.statusName = statusName;
    }
}
