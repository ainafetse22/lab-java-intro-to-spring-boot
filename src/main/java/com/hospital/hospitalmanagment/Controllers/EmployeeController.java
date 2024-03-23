package com.hospital.hospitalmanagment.Controllers;

import com.hospital.hospitalmanagment.Services.EmployeeService;
import com.hospital.hospitalmanagment.model.Employee;
import com.hospital.hospitalmanagment.model.Patient;
import com.hospital.hospitalmanagment.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/doctors")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllDoctors(){
        return employeeService.getAllEmployees();
    }

//    @GetMapping(value = "doctors")
//    @ResponseStatus(HttpStatus.OK)
//    public Optional<Employee> getDoctorById()


}
