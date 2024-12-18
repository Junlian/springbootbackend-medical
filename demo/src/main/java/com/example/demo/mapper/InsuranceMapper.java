package com.example.demo.mapper;

import com.example.demo.dto.InsuranceDTO;
import com.example.demo.model.mysql.InsuranceInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", 
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {CoverageDetailsMapper.class})
public interface InsuranceMapper {
    @Mapping(source = "coverageDetails", target = "coverage")
    InsuranceDTO toDTO(InsuranceInfo insuranceInfo);

    @Mapping(source = "coverage", target = "coverageDetails")
    InsuranceInfo toEntity(InsuranceDTO insuranceDTO);
} 