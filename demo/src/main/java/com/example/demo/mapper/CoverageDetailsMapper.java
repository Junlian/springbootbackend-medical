package com.example.demo.mapper;

import com.example.demo.dto.CoverageDetailsDTO;
import com.example.demo.model.mysql.CoverageDetails;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CoverageDetailsMapper {
    CoverageDetailsDTO toDTO(CoverageDetails coverageDetails);
    CoverageDetails toEntity(CoverageDetailsDTO coverageDetailsDTO);
} 