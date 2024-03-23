package com.hospital.hospitalmanagment.repositories;

import com.hospital.hospitalmanagment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
