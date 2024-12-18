package com.example.demo.mapper;

import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.model.mysql.DoctorAvailability;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AvailabilityMapper {
    AvailabilityDTO toDTO(DoctorAvailability availability);
    
    @Mapping(target = "doctor", ignore = true)
    DoctorAvailability toEntity(AvailabilityDTO dto);
    
    @Mapping(target = "doctor", ignore = true)
    void updateFromDTO(AvailabilityDTO dto, @MappingTarget DoctorAvailability availability);
} 