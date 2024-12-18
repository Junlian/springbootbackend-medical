package com.example.demo.mapper;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.model.mysql.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", 
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {AvailabilityMapper.class})
public interface DoctorMapper {
    DoctorDTO toDTO(Doctor doctor);
    Doctor toEntity(DoctorDTO dto);
} 