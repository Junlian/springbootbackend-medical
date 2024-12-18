package com.example.demo.service.impl;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;
import com.example.demo.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.model.mysql.DoctorAvailability;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.mapper.AvailabilityMapper;
import com.example.demo.exception.ResourceNotFoundException;
import java.time.LocalDate;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private AvailabilityMapper availabilityMapper;

    @Autowired
    private AvailabilityRepository availabilityRepository;

    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = doctorMapper.toEntity(doctorDTO);
        Doctor savedDoctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(savedDoctor);
    }

    @Override
    public DoctorDTO getDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Doctor not found with id: " + id));
        return doctorMapper.toDTO(doctor);
    }

    @Override
    public Page<DoctorDTO> getAllDoctors(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return doctorRepository.findAll(pageRequest).map(doctorMapper::toDTO);
    }

    @Override
    public DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO) {
        if (!doctorRepository.existsById(id)) {
            throw new EntityNotFoundException("Doctor not found with id: " + id);
        }
        Doctor doctor = doctorMapper.toEntity(doctorDTO);
        doctor.setId(id);
        Doctor updatedDoctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(updatedDoctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        if (!doctorRepository.existsById(id)) {
            throw new EntityNotFoundException("Doctor not found with id: " + id);
        }
        doctorRepository.deleteById(id);
    }

    @Override
    public List<DoctorDTO> getDoctorsBySpecialization(String specialization) {
        return doctorRepository.findBySpecialization(specialization)
            .stream()
            .map(doctorMapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public List<AvailabilityDTO> getDoctorAvailability(Long doctorId, String date) {
        Doctor doctor = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        LocalDate localDate = LocalDate.parse(date);
        return availabilityRepository.findByDoctorIdAndDate(doctorId, localDate)
            .stream()
            .map(availabilityMapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public List<AvailabilityDTO> updateAvailability(Long doctorId, List<AvailabilityDTO> availabilityDTOs) {
        Doctor doctor = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        
        List<DoctorAvailability> availabilities = availabilityDTOs.stream()
            .map(availabilityMapper::toEntity)
            .peek(a -> a.setDoctor(doctor))
            .collect(Collectors.toList());
            
        availabilities = availabilityRepository.saveAll(availabilities);
        
        return availabilities.stream()
            .map(availabilityMapper::toDTO)
            .collect(Collectors.toList());
    }
}