package com.example.Car_rental_PAI_project.service;

import com.example.Car_rental_PAI_project.model.Department;

import java.util.Collection;
import java.util.Optional;

public interface DepartmentService {
    Collection<Department> getAllDepartments();
    Optional<Department> getDepartment(Integer department_Id);
    Department setDepartment(Department department);
    void deleteDepartment(Integer department_Id);
}
