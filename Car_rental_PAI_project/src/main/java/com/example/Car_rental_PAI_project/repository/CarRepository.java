package com.example.Car_rental_PAI_project.repository;

import com.example.Car_rental_PAI_project.model.Car;
import com.example.Car_rental_PAI_project.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface CarRepository extends JpaRepository<Car,Integer> {

    Collection<Car> findAllByDepartmentEquals(Department department);

}
