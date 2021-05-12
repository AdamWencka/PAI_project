package com.example.Car_rental_PAI_project.repository;

import com.example.Car_rental_PAI_project.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
