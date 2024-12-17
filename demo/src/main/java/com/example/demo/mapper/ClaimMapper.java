package com.example.demo.mapper;

import com.example.demo.dto.ClaimDTO;
import com.example.demo.model.mysql.Claim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClaimMapper {
    @Mapping(source = "patient.id", target = "patientId")
    @Mapping(source = "appointment.id", target = "appointmentId")
    ClaimDTO toDTO(Claim claim);
    
    @Mapping(target = "patient", ignore = true)
    @Mapping(target = "appointment", ignore = true)
    Claim toEntity(ClaimDTO claimDTO);
    
    List<ClaimDTO> toDTOList(List<Claim> claims);
    
    @Mapping(target = "patient", ignore = true)
    @Mapping(target = "appointment", ignore = true)
    void updateEntity(ClaimDTO claimDTO, @MappingTarget Claim claim);
} 