package com.example.demo.service;

import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.dto.MedicalRecordDTO;
import org.springframework.data.domain.Page;

public interface MedicalRecordService {
    MedicalRecordDTO createMedicalRecord(Long patientId, MedicalRecordDTO medicalRecordDTO);
    MedicalRecordDTO getMedicalRecord(Long patientId, String recordId);
    MedicalRecordDTO updateMedicalRecord(Long patientId, String recordId, MedicalRecordDTO medicalRecordDTO);
    Page<MedicalRecordDTO> getPatientMedicalRecords(Long patientId, int page, int size);
}