package com.example.demo.service;

import com.example.demo.dto.AppointmentDTO;
import org.springframework.data.domain.Page;

public interface AppointmentService {
    AppointmentDTO createAppointment(AppointmentDTO appointmentDTO);
    Page<AppointmentDTO> getAppointments(Long doctorId, Long patientId, String status, String fromDate, String toDate, int page, int size);
    AppointmentDTO getAppointmentById(Long id);
    AppointmentDTO updateAppointmentStatus(Long id, String status);
}