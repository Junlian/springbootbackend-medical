package com.example.demo.mapper.impl;

import org.springframework.stereotype.Component;
import com.example.demo.mapper.ClaimMapper;
import com.example.demo.entity.Claim;
import com.example.demo.dto.ClaimDTO;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClaimMapperImpl implements ClaimMapper {
    @Override
    public ClaimDTO toDTO(Claim claim) {
        if (claim == null) {
            return null;
        }
        
        ClaimDTO dto = new ClaimDTO();
        dto.setId(claim.getId());
        dto.setPolicyId(claim.getPolicyId());
        dto.setClaimDate(claim.getClaimDate());
        dto.setClaimAmount(claim.getClaimAmount());
        dto.setStatus(claim.getStatus());
        return dto;
    }

    @Override
    public Claim toEntity(ClaimDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Claim claim = new Claim();
        claim.setId(dto.getId());
        claim.setPolicyId(dto.getPolicyId());
        claim.setClaimDate(dto.getClaimDate());
        claim.setClaimAmount(dto.getClaimAmount());
        claim.setStatus(dto.getStatus());
        return claim;
    }

    @Override
    public List<ClaimDTO> toDTOList(List<Claim> claims) {
        if (claims == null) {
            return null;
        }
        return claims.stream()
                    .map(this::toDTO)
                    .collect(Collectors.toList());
    }
} 