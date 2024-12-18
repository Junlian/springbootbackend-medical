package com.example.demo.service;

import com.example.demo.model.mysql.Doctor;
import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.AvailabilityDTO;
import java.util.List;
import org.springframework.data.domain.Page;
import java.time.LocalDate;

public interface DoctorService {
    DoctorDTO createDoctor(DoctorDTO doctorDTO);
    Page<DoctorDTO> getDoctors(int page, int size, String specialization);
    List<DoctorDTO> getAvailableDoctors();
    DoctorDTO updateDoctorAvailability(Long doctorId, boolean isAvailable);
    DoctorDTO getDoctor(Long id);
    DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO);
    void deleteDoctor(Long id);
    List<AvailabilityDTO> getDoctorAvailability(Long id, LocalDate date);
}