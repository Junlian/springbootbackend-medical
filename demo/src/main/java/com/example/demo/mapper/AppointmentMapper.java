package com.example.demo.mapper;

import com.example.demo.dto.AppointmentDTO;
import com.example.demo.model.mysql.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AppointmentMapper {
    
    @Mapping(source = "patient.id", target = "patientId")
    @Mapping(source = "doctor.id", target = "doctorId")
    AppointmentDTO toDTO(Appointment appointment);
    
    @Mapping(target = "patient", ignore = true)
    @Mapping(target = "doctor", ignore = true)
    Appointment toEntity(AppointmentDTO appointmentDTO);
    
    @Mapping(target = "patient", ignore = true)
    @Mapping(target = "doctor", ignore = true)
    void updateEntity(AppointmentDTO appointmentDTO, @MappingTarget Appointment appointment);
} 