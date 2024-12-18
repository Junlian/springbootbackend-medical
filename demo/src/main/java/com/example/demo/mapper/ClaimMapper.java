package com.example.demo.mapper;

import com.example.demo.dto.ClaimDTO;
import com.example.demo.model.mysql.Claim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClaimMapper {
    
    @Mapping(target = "patient.id", source = "patientId")
    Claim toEntity(ClaimDTO dto);
    
    @Mapping(target = "patientId", source = "patient.id")
    ClaimDTO toDTO(Claim claim);
} 