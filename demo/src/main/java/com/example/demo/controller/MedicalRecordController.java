package com.example.demo.controller;

import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/medical-records")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @GetMapping
    public ResponseEntity<Page<MedicalRecordDTO>> getPatientMedicalRecords(
            @RequestParam Long patientId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(medicalRecordService.getPatientMedicalRecords(patientId, page, size));
    }

    @PostMapping
    public ResponseEntity<MedicalRecordDTO> createMedicalRecord(
            @RequestParam Long patientId,
            @Valid @RequestBody MedicalRecordDTO medicalRecordDTO) {
        return ResponseEntity.ok(medicalRecordService.createMedicalRecord(patientId, medicalRecordDTO));
    }

    @GetMapping("/{recordId}")
    public ResponseEntity<MedicalRecordDTO> getMedicalRecord(
            @PathVariable String recordId) {
        return ResponseEntity.ok(medicalRecordService.getMedicalRecord(recordId));
    }

    @PutMapping("/{recordId}")
    public ResponseEntity<MedicalRecordDTO> updateMedicalRecord(
            @PathVariable String recordId,
            @Valid @RequestBody MedicalRecordDTO medicalRecordDTO) {
        return ResponseEntity.ok(medicalRecordService.updateMedicalRecord(recordId, medicalRecordDTO));
    }

    @DeleteMapping("/{recordId}")
    public ResponseEntity<Void> deleteMedicalRecord(@PathVariable String recordId) {
        medicalRecordService.deleteMedicalRecord(recordId);
        return ResponseEntity.ok().build();
    }
} 