package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Department;

import java.util.Optional;

public interface DepartmentService {
    Optional<Department> getDepartment(Long department_Id);
    Department setDepartment(Department department);
    void deleteDepartment(Long department_Id);
}
