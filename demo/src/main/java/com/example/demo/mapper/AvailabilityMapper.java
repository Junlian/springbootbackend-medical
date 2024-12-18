package com.example.demo.mapper;

import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.model.mysql.Availability;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AvailabilityMapper {
    AvailabilityDTO toDTO(Availability availability);
    
    @Mapping(target = "doctor", ignore = true)
    Availability toEntity(AvailabilityDTO dto);
    
    @Mapping(target = "doctor", ignore = true)
    void updateFromDTO(AvailabilityDTO dto, @MappingTarget Availability availability);
} 