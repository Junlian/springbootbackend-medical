package com.example.demo.service.impl;

import com.example.demo.model.mysql.Doctor;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;
import com.example.demo.service.DoctorAvailabilityService;
import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.mapper.DoctorMapper;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DoctorAvailabilityService doctorAvailabilityService;

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = doctorMapper.toEntity(doctorDTO);
        return doctorMapper.toDTO(doctorRepository.save(doctor));
    }

    @Override
    public List<DoctorDTO> getAvailableDoctors() {
        return doctorRepository.findByIsAvailableTrue().stream()
            .map(doctorMapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public DoctorDTO updateDoctorAvailability(Long doctorId, boolean isAvailable) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        AvailabilityDTO availabilityDTO = new AvailabilityDTO();
        availabilityDTO.setIsAvailable(isAvailable);
        availabilityDTO.setStartTime(LocalDateTime.now());
        availabilityDTO.setEndTime(LocalDateTime.now().plusHours(8));
        doctorAvailabilityService.updateAvailability(doctorId, null, availabilityDTO);
        return doctorMapper.toDTO(doctor);
    }

    @Override
    public Page<DoctorDTO> getDoctors(int page, int size, String specialization) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Doctor> doctors = specialization != null 
            ? doctorRepository.findBySpecialization(specialization, pageRequest)
            : doctorRepository.findAll(pageRequest);
        return doctors.map(doctorMapper::toDTO);
    }

    @Override
    public DoctorDTO getDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        return doctorMapper.toDTO(doctor);
    }

    @Override
    public DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO) {
        if (!doctorRepository.existsById(id)) {
            throw new ResourceNotFoundException("Doctor not found");
        }
        Doctor doctor = doctorMapper.toEntity(doctorDTO);
        doctor.setId(id);
        return doctorMapper.toDTO(doctorRepository.save(doctor));
    }

    @Override
    public void deleteDoctor(Long id) {
        if (!doctorRepository.existsById(id)) {
            throw new ResourceNotFoundException("Doctor not found");
        }
        doctorRepository.deleteById(id);
    }

    @Override
    public List<AvailabilityDTO> getDoctorAvailability(Long id, LocalDate date) {
        return doctorAvailabilityService.getDoctorAvailability(id, date);
    }
}