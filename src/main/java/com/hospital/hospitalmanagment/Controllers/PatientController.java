package com.hospital.hospitalmanagment.Controllers;

import com.hospital.hospitalmanagment.Services.EmployeeService;
import com.hospital.hospitalmanagment.Services.PatientService;
import com.hospital.hospitalmanagment.model.Employee;
import com.hospital.hospitalmanagment.model.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientsService;

    @GetMapping("/patients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> getAllPatients(){
        return patientsService.getAllPatients();
    }

}
