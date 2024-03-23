package com.hospital.hospitalmanagment.Services;

import com.hospital.hospitalmanagment.model.Employee;
import com.hospital.hospitalmanagment.model.Patient;
import com.hospital.hospitalmanagment.repositories.EmployeeRepository;
import com.hospital.hospitalmanagment.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
