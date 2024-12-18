package com.example.demo.service;

import com.example.demo.dto.PatientDTO;
import org.springframework.data.domain.Page;

public interface PatientService {
    PatientDTO createPatient(PatientDTO patientDTO);
    PatientDTO getPatientById(Long id);
    Page<PatientDTO> getAllPatients(int page, int size, String sort, String order);
    PatientDTO updatePatient(Long id, PatientDTO patientDTO);
    void deletePatient(Long id);
} 