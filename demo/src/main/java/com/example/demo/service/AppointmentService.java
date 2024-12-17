package com.example.demo.service;

import com.example.demo.dto.AppointmentDTO;
import com.example.demo.model.mysql.Appointment;
import com.example.demo.model.mysql.Doctor;
import com.example.demo.model.mysql.Patient;
import com.example.demo.model.mysql.enums.AppointmentStatus;
import com.example.demo.repository.jpa.AppointmentRepository;
import com.example.demo.repository.jpa.DoctorRepository;
import com.example.demo.repository.jpa.PatientRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.InvalidOperationException;
import com.example.demo.mapper.AppointmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final AppointmentMapper appointmentMapper;
    private final NotificationService notificationService;

    @Transactional
    public AppointmentDTO scheduleAppointment(AppointmentDTO appointmentDTO) {
        validateAppointment(appointmentDTO);
        
        Doctor doctor = doctorRepository.findById(appointmentDTO.getDoctorId())
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            
        Patient patient = patientRepository.findById(appointmentDTO.getPatientId())
            .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
            
        if (appointmentRepository.existsByDoctorAndDateTime(doctor.getId(), appointmentDTO.getDateTime())) {
            throw new InvalidOperationException("Doctor is not available at the requested time");
        }
        
        Appointment appointment = appointmentMapper.toEntity(appointmentDTO);
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
        
        appointment = appointmentRepository.save(appointment);
        notificationService.sendAppointmentConfirmation(appointment);
        
        return appointmentMapper.toDTO(appointment);
    }

    @Transactional
    public AppointmentDTO rescheduleAppointment(Long id, AppointmentDTO appointmentDTO) {
        Appointment appointment = appointmentRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
            
        if (appointmentRepository.existsByDoctorAndDateTime(
                appointment.getDoctor().getId(), 
                appointmentDTO.getDateTime())) {
            throw new InvalidOperationException("Doctor is not available at the requested time");
        }
        
        LocalDateTime oldDateTime = appointment.getDateTime();
        appointmentMapper.updateEntity(appointmentDTO, appointment);
        
        appointment = appointmentRepository.save(appointment);
        notificationService.sendReschedulingNotification(appointment, oldDateTime);
        
        return appointmentMapper.toDTO(appointment);
    }

    @Transactional
    public void cancelAppointment(Long id, String reason) {
        Appointment appointment = appointmentRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
            
        appointment.setStatus(AppointmentStatus.CANCELLED);
        appointment.setCancellationReason(reason);
        
        appointmentRepository.save(appointment);
        notificationService.sendCancellationNotice(appointment);
    }

    @Transactional(readOnly = true)
    public List<LocalDateTime> getAvailableSlots(Long doctorId, LocalDate date) {
        Doctor doctor = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);
        
        List<Appointment> existingAppointments = appointmentRepository
            .findByDoctorAndDateTimeBetween(doctorId, startOfDay, endOfDay);
            
        // Calculate available slots based on doctor's availability and existing appointments
        return calculateAvailableSlots(doctor, date, existingAppointments);
    }

    @Transactional(readOnly = true)
    public Page<AppointmentDTO> searchAppointments(Pageable pageable) {
        Page<Appointment> appointments = appointmentRepository.findAll(pageable);
        return appointments.map(appointmentMapper::toDTO);
    }

    private void validateAppointment(AppointmentDTO appointmentDTO) {
        if (appointmentDTO.getDateTime().isBefore(LocalDateTime.now())) {
            throw new InvalidOperationException("Cannot schedule appointment in the past");
        }
        // Add more validation rules as needed
    }

    private List<LocalDateTime> calculateAvailableSlots(
            Doctor doctor, 
            LocalDate date, 
            List<Appointment> existingAppointments) {
        // Implementation to calculate available time slots
        // based on doctor's availability and existing appointments
        // This would be a complex implementation considering working hours,
        // appointment duration, breaks, etc.
        return List.of(); // Placeholder
    }
}