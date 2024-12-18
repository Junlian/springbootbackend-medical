package com.example.demo.mapper;

import com.example.demo.dto.InsuranceDTO;
import com.example.demo.model.mysql.InsuranceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsuranceMapper {
    
    @Autowired
    private CoverageDetailsMapper coverageDetailsMapper;
    
    public InsuranceDTO toDTO(InsuranceInfo insuranceInfo) {
        if (insuranceInfo == null) {
            return null;
        }
        InsuranceDTO dto = new InsuranceDTO();
        dto.setId(insuranceInfo.getId());
        dto.setProvider(insuranceInfo.getProvider());
        dto.setPolicyNumber(insuranceInfo.getPolicyNumber());
        dto.setGroupNumber(insuranceInfo.getGroupNumber());
        dto.setValidFrom(insuranceInfo.getValidFrom());
        dto.setValidUntil(insuranceInfo.getValidUntil());
        dto.setCoverage(coverageDetailsMapper.toDTO(insuranceInfo.getCoverageDetails()));
        return dto;
    }

    public InsuranceInfo toEntity(InsuranceDTO dto) {
        if (dto == null) {
            return null;
        }
        InsuranceInfo info = new InsuranceInfo();
        info.setId(dto.getId());
        info.setProvider(dto.getProvider());
        info.setPolicyNumber(dto.getPolicyNumber());
        info.setGroupNumber(dto.getGroupNumber());
        info.setValidFrom(dto.getValidFrom());
        info.setValidUntil(dto.getValidUntil());
        info.setCoverageDetails(coverageDetailsMapper.toEntity(dto.getCoverage()));
        return info;
    }
} 