package com.example.demo.service.impl;

import com.example.demo.dto.AppointmentDTO;
import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.AppointmentService;
import com.example.demo.mapper.AppointmentMapper;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    @Autowired
    private PatientRepository patientRepository;
    
    @Autowired
    private AppointmentMapper appointmentMapper;

    @Override
    public AppointmentDTO createAppointment(AppointmentDTO appointmentDTO) {
        // Verify doctor exists
        doctorRepository.findById(appointmentDTO.getDoctorId())
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));

        // Verify patient exists
        patientRepository.findById(appointmentDTO.getPatientId())
            .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));

        Appointment appointment = appointmentMapper.toEntity(appointmentDTO);
        appointment.setStatus("SCHEDULED");
        return appointmentMapper.toDTO(appointmentRepository.save(appointment));
    }

    @Override
    public Page<AppointmentDTO> getAppointments(Long doctorId, Long patientId, String status, 
            String fromDate, String toDate, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return appointmentRepository.findAll(pageRequest).map(appointmentMapper::toDTO);
    }

    @Override
    public AppointmentDTO getAppointmentById(Long id) {
        Appointment appointment = appointmentRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
        return appointmentMapper.toDTO(appointment);
    }

    @Override
    public AppointmentDTO updateAppointmentStatus(Long id, String status) {
        Appointment appointment = appointmentRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
        appointment.setStatus(status);
        return appointmentMapper.toDTO(appointmentRepository.save(appointment));
    }
} 