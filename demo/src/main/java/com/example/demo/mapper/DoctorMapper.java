package com.example.demo.mapper;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.model.mysql.Doctor;
import com.example.demo.model.mysql.Availability;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DoctorMapper {
    DoctorDTO toDTO(Doctor doctor);
    Doctor toEntity(DoctorDTO doctorDTO);
    void updateEntity(DoctorDTO doctorDTO, @MappingTarget Doctor doctor);
    void updateAvailability(List<AvailabilityDTO> availabilityDTO, @MappingTarget List<Availability> doctorAvailabilities);
} 