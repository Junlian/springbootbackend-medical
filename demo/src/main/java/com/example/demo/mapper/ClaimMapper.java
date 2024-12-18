package com.example.demo.mapper;

import org.springframework.stereotype.Component;
import com.example.demo.entity.Claim;
import com.example.demo.dto.ClaimDTO;
import java.util.List;

@Component
public interface ClaimMapper {
    ClaimDTO toDTO(Claim claim);
    Claim toEntity(ClaimDTO claimDTO);
    List<ClaimDTO> toDTOList(List<Claim> claims);
} 