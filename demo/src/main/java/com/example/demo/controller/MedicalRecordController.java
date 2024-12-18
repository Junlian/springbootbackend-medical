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

    @GetMapping("/{patientId}")
    public ResponseEntity<Page<MedicalRecordDTO>> getPatientMedicalRecords(
            @PathVariable Long patientId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        return ResponseEntity.ok(medicalRecordService.getPatientMedicalRecords(patientId, page, size));
    }

    @PostMapping("/{patientId}")
    public ResponseEntity<MedicalRecordDTO> createMedicalRecord(
            @PathVariable Long patientId,
            @Valid @RequestBody MedicalRecordDTO medicalRecordDTO) {
        return ResponseEntity.ok(medicalRecordService.createMedicalRecord(patientId, medicalRecordDTO));
    }

    @GetMapping("/{patientId}/{recordId}")
    public ResponseEntity<MedicalRecordDTO> getMedicalRecord(
            @PathVariable Long patientId,
            @PathVariable String recordId) {
        return ResponseEntity.ok(medicalRecordService.getMedicalRecord(patientId, recordId));
    }

    @PutMapping("/{patientId}/{recordId}")
    public ResponseEntity<MedicalRecordDTO> updateMedicalRecord(
            @PathVariable Long patientId,
            @PathVariable String recordId,
            @Valid @RequestBody MedicalRecordDTO medicalRecordDTO) {
        return ResponseEntity.ok(medicalRecordService.updateMedicalRecord(patientId, recordId, medicalRecordDTO));
    }
} 