package com.example.demo.mapper;

import com.example.demo.dto.PatientDTO;
import com.example.demo.model.mysql.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PatientMapper {
    PatientDTO toDTO(Patient patient);
    Patient toEntity(PatientDTO patientDTO);
    void updateEntity(PatientDTO patientDTO, @MappingTarget Patient patient);
} 