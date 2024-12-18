package com.example.demo.service;

import com.example.demo.dto.AvailabilityDTO;
import java.time.LocalDate;
import java.util.List;

public interface DoctorAvailabilityService {
    List<AvailabilityDTO> getDoctorAvailability(Long doctorId, LocalDate date);
    AvailabilityDTO addAvailability(Long doctorId, AvailabilityDTO availabilityDTO);
    AvailabilityDTO updateAvailability(Long doctorId, Long availabilityId, AvailabilityDTO availabilityDTO);
    void deleteAvailability(Long doctorId, Long availabilityId);
} 