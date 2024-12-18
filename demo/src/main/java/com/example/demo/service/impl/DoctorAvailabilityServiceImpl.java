package com.example.demo.service.impl;

import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.AvailabilityMapper;
import com.example.demo.model.mysql.DoctorAvailability;
import com.example.demo.entity.Doctor;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorAvailabilityServiceImpl implements DoctorAvailabilityService {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AvailabilityMapper availabilityMapper;

    @Override
    public List<AvailabilityDTO> getDoctorAvailability(Long doctorId, LocalDate date) {
        return availabilityRepository.findByDoctorIdAndDate(doctorId, date)
            .stream()
            .map(availabilityMapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public AvailabilityDTO addAvailability(Long doctorId, AvailabilityDTO dto) {
        Doctor doctor = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        
        DoctorAvailability availability = availabilityMapper.toEntity(dto);
        availability.setDoctor(doctor);
        return availabilityMapper.toDTO(availabilityRepository.save(availability));
    }

    @Override
    public AvailabilityDTO updateAvailability(Long doctorId, Long availabilityId, AvailabilityDTO dto) {
        DoctorAvailability availability = availabilityRepository.findByIdAndDoctorId(availabilityId, doctorId)
            .orElseThrow(() -> new ResourceNotFoundException("Availability not found"));
        
        availabilityMapper.updateFromDTO(dto, availability);
        return availabilityMapper.toDTO(availabilityRepository.save(availability));
    }

    @Override
    public void deleteAvailability(Long doctorId, Long availabilityId) {
        if (!availabilityRepository.existsByIdAndDoctorId(availabilityId, doctorId)) {
            throw new ResourceNotFoundException("Availability not found");
        }
        availabilityRepository.deleteById(availabilityId);
    }
} 