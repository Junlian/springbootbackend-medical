package com.example.demo.service;

import com.example.demo.dto.PatientDTO;
import com.example.demo.model.mysql.Patient;
import com.example.demo.repository.jpa.PatientRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.DuplicateResourceException;
import com.example.demo.mapper.PatientMapper;
import com.example.demo.criteria.PatientSearchCriteria;
import com.example.demo.specification.PatientSpecifications;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PatientService {
    
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    @Transactional
    public PatientDTO registerPatient(PatientDTO patientDTO) {
        if (patientRepository.existsByEmail(patientDTO.getEmail())) {
            throw new DuplicateResourceException("Patient with email " + patientDTO.getEmail() + " already exists");
        }
        
        Patient patient = patientMapper.toEntity(patientDTO);
        patient = patientRepository.save(patient);
        return patientMapper.toDTO(patient);
    }

    @Transactional
    public PatientDTO updatePatient(Long id, PatientDTO patientDTO) {
        Patient patient = patientRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));
            
        patientMapper.updateEntity(patientDTO, patient);
        patient = patientRepository.save(patient);
        return patientMapper.toDTO(patient);
    }

    @Transactional(readOnly = true)
    public PatientDTO getPatientById(Long id) {
        Patient patient = patientRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));
        return patientMapper.toDTO(patient);
    }

    @Transactional(readOnly = true)
    public Page<PatientDTO> searchPatients(PatientSearchCriteria criteria, Pageable pageable) {
        Page<Patient> patients = patientRepository.findAll(
            PatientSpecifications.withCriteria(criteria), 
            pageable
        );
        return patients.map(patientMapper::toDTO);
    }

    @Transactional
    public void deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new ResourceNotFoundException("Patient not found with id: " + id);
        }
        patientRepository.deleteById(id);
    }
} 