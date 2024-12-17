package com.example.demo.mapper;

import com.example.demo.dto.InsuranceInfoDTO;
import com.example.demo.model.mysql.InsuranceInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface InsuranceMapper {
    @Mapping(source = "patient.id", target = "patientId")
    InsuranceInfoDTO toDTO(InsuranceInfo insurance);
    
    @Mapping(target = "patient", ignore = true)
    InsuranceInfo toEntity(InsuranceInfoDTO insuranceDTO);
} 