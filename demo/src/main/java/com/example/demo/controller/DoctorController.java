package com.example.demo.controller;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
@CrossOrigin(origins = "http://localhost:5173")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<DoctorDTO> createDoctor(@Valid @RequestBody DoctorDTO doctorDTO) {
        return ResponseEntity.ok(doctorService.createDoctor(doctorDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable Long id) {
        return ResponseEntity.ok(doctorService.getDoctorById(id));
    }

    @GetMapping
    public ResponseEntity<Page<DoctorDTO>> getDoctors(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(doctorService.getAllDoctors(page, size));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoctorDTO> updateDoctor(
            @PathVariable Long id,
            @Valid @RequestBody DoctorDTO doctorDTO) {
        return ResponseEntity.ok(doctorService.updateDoctor(id, doctorDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/specialization/{specialization}")
    public ResponseEntity<List<DoctorDTO>> getDoctorsBySpecialization(
            @PathVariable String specialization) {
        return ResponseEntity.ok(doctorService.getDoctorsBySpecialization(specialization));
    }

    @GetMapping("/{id}/availability")
    public ResponseEntity<List<AvailabilityDTO>> getDoctorAvailability(
            @PathVariable Long id,
            @RequestParam String date) {
        return ResponseEntity.ok(doctorService.getDoctorAvailability(id, date));
    }

    @PutMapping("/{id}/availability")
    public ResponseEntity<List<AvailabilityDTO>> updateAvailability(
            @PathVariable Long id,
            @RequestBody List<AvailabilityDTO> availability) {
        return ResponseEntity.ok(doctorService.updateAvailability(id, availability));
    }
}