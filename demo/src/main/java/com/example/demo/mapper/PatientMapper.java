package com.example.demo.mapper;

import com.example.demo.dto.PatientDTO;
import com.example.demo.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    public Patient toEntity(PatientDTO dto) {
        if (dto == null) return null;
        
        Patient patient = new Patient();
        patient.setId(dto.getId());
        patient.setFirstName(dto.getFirstName());
        patient.setLastName(dto.getLastName());
        patient.setEmail(dto.getEmail());
        patient.setPhone(dto.getPhone());
        return patient;
    }

    public PatientDTO toDTO(Patient entity) {
        if (entity == null) return null;
        
        PatientDTO dto = new PatientDTO();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        return dto;
    }
} 