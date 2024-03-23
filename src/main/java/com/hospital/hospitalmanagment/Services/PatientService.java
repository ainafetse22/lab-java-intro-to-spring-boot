package com.hospital.hospitalmanagment.Services;

import com.hospital.hospitalmanagment.model.Patient;
import com.hospital.hospitalmanagment.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
