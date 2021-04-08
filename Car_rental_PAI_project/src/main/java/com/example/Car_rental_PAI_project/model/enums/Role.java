package com.example.Car_rental_PAI_project.model.enums;

import lombok.Getter;

@Getter
public enum Role {
    WORKER("PRACOWNIK"),
    MANAGER("MENEDŻER");

    private final String roleName;
    Role(String roleName) {
        this.roleName = roleName;
    }
}
