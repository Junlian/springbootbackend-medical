package com.example.demo.controller;

import com.example.demo.dto.AvailabilityDTO;
import com.example.demo.service.DoctorAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors/{doctorId}/availability")
public class DoctorAvailabilityController {

    @Autowired
    private DoctorAvailabilityService availabilityService;

    @GetMapping
    public ResponseEntity<List<AvailabilityDTO>> getDoctorAvailability(
            @PathVariable Long doctorId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(availabilityService.getDoctorAvailability(doctorId, date));
    }

    @PostMapping
    public ResponseEntity<AvailabilityDTO> addAvailability(
            @PathVariable Long doctorId,
            @Valid @RequestBody AvailabilityDTO availabilityDTO) {
        return ResponseEntity.ok(availabilityService.addAvailability(doctorId, availabilityDTO));
    }

    @PutMapping("/{availabilityId}")
    public ResponseEntity<AvailabilityDTO> updateAvailability(
            @PathVariable Long doctorId,
            @PathVariable Long availabilityId,
            @Valid @RequestBody AvailabilityDTO availabilityDTO) {
        return ResponseEntity.ok(availabilityService.updateAvailability(doctorId, availabilityId, availabilityDTO));
    }

    @DeleteMapping("/{availabilityId}")
    public ResponseEntity<Void> deleteAvailability(
            @PathVariable Long doctorId,
            @PathVariable Long availabilityId) {
        availabilityService.deleteAvailability(doctorId, availabilityId);
        return ResponseEntity.ok().build();
    }
} 