package com.example.demo.mapper;

import com.example.demo.dto.AppointmentDTO;
import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class AppointmentMapper {
    
    public Appointment toEntity(AppointmentDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Appointment appointment = new Appointment();
        appointment.setId(dto.getId());
        
        Patient patient = new Patient();
        patient.setId(dto.getPatientId());
        appointment.setPatient(patient);
        
        Doctor doctor = new Doctor();
        doctor.setId(dto.getDoctorId());
        appointment.setDoctor(doctor);
        
        appointment.setAppointmentDateTime(dto.getAppointmentDateTime());
        appointment.setStatus(dto.getStatus());
        appointment.setNotes(dto.getNotes());
        return appointment;
    }

    public AppointmentDTO toDTO(Appointment appointment) {
        if (appointment == null) {
            return null;
        }
        
        AppointmentDTO dto = new AppointmentDTO();
        dto.setId(appointment.getId());
        dto.setPatientId(appointment.getPatient().getId());
        dto.setDoctorId(appointment.getDoctor().getId());
        dto.setAppointmentDateTime(appointment.getAppointmentDateTime());
        dto.setStatus(appointment.getStatus());
        dto.setNotes(appointment.getNotes());
        return dto;
    }
} 