package com.example.demo.service;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.AvailabilityDTO;
import org.springframework.data.domain.Page;
import java.util.List;
import java.util.stream.Collectors;

public interface DoctorService {
    DoctorDTO createDoctor(DoctorDTO doctorDTO);
    DoctorDTO getDoctorById(Long id);
    Page<DoctorDTO> getAllDoctors(int page, int size);
    DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO);
    void deleteDoctor(Long id);
    List<DoctorDTO> getDoctorsBySpecialization(String specialization);
    List<AvailabilityDTO> getDoctorAvailability(Long doctorId, String date);
    List<AvailabilityDTO> updateAvailability(Long doctorId, List<AvailabilityDTO> availabilityDTOs);
}