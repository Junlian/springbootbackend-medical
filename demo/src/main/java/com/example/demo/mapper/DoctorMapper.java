package com.example.demo.mapper;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.entity.Doctor;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {
    
    public DoctorDTO toDTO(Doctor doctor) {
        if (doctor == null) {
            return null;
        }

        DoctorDTO dto = new DoctorDTO();
        dto.setId(doctor.getId());
        dto.setFirstName(doctor.getFirstName());
        dto.setLastName(doctor.getLastName());
        dto.setSpecialization(doctor.getSpecialization());
        dto.setLicenseNumber(doctor.getLicenseNumber());
        dto.setEmail(doctor.getEmail());
        dto.setPhoneNumber(doctor.getPhoneNumber());
        dto.setStatus(doctor.getStatus());
        dto.setCreatedAt(doctor.getCreatedAt());
        return dto;
    }

    public Doctor toEntity(DoctorDTO dto) {
        if (dto == null) {
            return null;
        }

        Doctor doctor = new Doctor();
        doctor.setId(dto.getId());
        doctor.setFirstName(dto.getFirstName());
        doctor.setLastName(dto.getLastName());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setLicenseNumber(dto.getLicenseNumber());
        doctor.setEmail(dto.getEmail());
        doctor.setPhoneNumber(dto.getPhoneNumber());
        doctor.setStatus(dto.getStatus());
        doctor.setCreatedAt(dto.getCreatedAt());
        return doctor;
    }
} 