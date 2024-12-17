package com.example.demo.service;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.model.mysql.Doctor;
import com.example.demo.repository.jpa.DoctorRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.DuplicateResourceException;
import com.example.demo.mapper.DoctorMapper;
import com.example.demo.specification.DoctorSpecifications;
import com.example.demo.criteria.DoctorSearchCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;

@Service
@RequiredArgsConstructor
public class DoctorService {
    
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    @Transactional
    public DoctorDTO registerDoctor(DoctorDTO doctorDTO) {
        validateNewDoctor(doctorDTO);
        Doctor doctor = doctorMapper.toEntity(doctorDTO);
        doctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(doctor);
    }

    @Transactional
    public DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO) {
        Doctor doctor = doctorRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
            
        doctorMapper.updateEntity(doctorDTO, doctor);
        doctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(doctor);
    }

    @Transactional(readOnly = true)
    public DoctorDTO getDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
        return doctorMapper.toDTO(doctor);
    }

    @Transactional(readOnly = true)
    public Page<DoctorDTO> searchDoctors(DoctorSearchCriteria criteria, Pageable pageable) {
        Specification<Doctor> spec = DoctorSpecifications.withCriteria(criteria);
        Page<Doctor> doctors = doctorRepository.findAll(spec, pageable);
        return doctors.map(doctorMapper::toDTO);
    }

    @Transactional
    public void updateAvailability(Long doctorId, List<AvailabilityDTO> availability) {
        Doctor doctor = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + doctorId));
            
        doctorMapper.updateAvailability(availability, doctor.getAvailabilities());
        doctorRepository.save(doctor);
    }

    private void validateNewDoctor(DoctorDTO doctorDTO) {
        if (doctorRepository.existsByEmail(doctorDTO.getEmail())) {
            throw new DuplicateResourceException("Doctor with email " + doctorDTO.getEmail() + " already exists");
        }
        if (doctorRepository.existsByLicenseNumber(doctorDTO.getLicenseNumber())) {
            throw new DuplicateResourceException("Doctor with license number " + doctorDTO.getLicenseNumber() + " already exists");
        }
    }
}