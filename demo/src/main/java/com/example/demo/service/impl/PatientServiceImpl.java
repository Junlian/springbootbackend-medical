package com.example.demo.service.impl;

import com.example.demo.dto.PatientDTO;
import com.example.demo.mapper.PatientMapper;
import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;
    
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = patientMapper.toEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return patientMapper.toDTO(savedPatient);
    }

    @Override
    public PatientDTO getPatientById(Long id) {
        Patient patient = patientRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Patient not found with id: " + id));
        return patientMapper.toDTO(patient);
    }

    @Override
    public Page<PatientDTO> getAllPatients(int page, int size, String sort, String order) {
        Sort.Direction direction = Sort.Direction.fromString(order.toUpperCase());
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(direction, sort));
        Page<Patient> patientPage = patientRepository.findAll(pageRequest);
        return patientPage.map(patientMapper::toDTO);
    }

    @Override
    @Transactional
    public PatientDTO updatePatient(Long id, PatientDTO patientDTO) {
        if (!patientRepository.existsById(id)) {
            throw new EntityNotFoundException("Patient not found with id: " + id);
        }

        Patient patient = patientMapper.toEntity(patientDTO);
        patient.setId(id);
        Patient updatedPatient = patientRepository.save(patient);
        return patientMapper.toDTO(updatedPatient);
    }

    @Override
    @Transactional
    public void deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new EntityNotFoundException("Patient not found with id: " + id);
        }
        patientRepository.deleteById(id);
    }
} 