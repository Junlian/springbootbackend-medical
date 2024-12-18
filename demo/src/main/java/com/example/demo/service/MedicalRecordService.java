package com.example.demo.service;

import com.example.demo.dto.MedicalRecordDTO;
import org.springframework.data.domain.Page;

public interface MedicalRecordService {
    Page<MedicalRecordDTO> getPatientMedicalRecords(Long patientId, int page, int size);
    MedicalRecordDTO createMedicalRecord(Long patientId, MedicalRecordDTO medicalRecordDTO);
    MedicalRecordDTO getMedicalRecord(String recordId);
    MedicalRecordDTO updateMedicalRecord(String recordId, MedicalRecordDTO medicalRecordDTO);
    void deleteMedicalRecord(String recordId);
}