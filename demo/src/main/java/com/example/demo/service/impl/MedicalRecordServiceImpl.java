package com.example.demo.service.impl;

import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.repository.MedicalRecordRepository;
import com.example.demo.service.MedicalRecordService;
import com.example.demo.mapper.MedicalRecordMapper;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
    
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;
    
    @Autowired
    private MedicalRecordMapper medicalRecordMapper;

    @Override
    public MedicalRecordDTO createMedicalRecord(Long patientId, MedicalRecordDTO dto) {
        MedicalRecord record = medicalRecordMapper.toEntity(dto);
        record.setPatientId(patientId);
        record.setCreatedAt(LocalDateTime.now());
        record.setUpdatedAt(LocalDateTime.now());
        return medicalRecordMapper.toDTO(medicalRecordRepository.save(record));
    }

    @Override
    public MedicalRecordDTO getMedicalRecord(Long patientId, String recordId) {
        MedicalRecord record = medicalRecordRepository.findByIdAndPatientId(recordId, patientId)
            .orElseThrow(() -> new ResourceNotFoundException("Medical Record not found"));
        return medicalRecordMapper.toDTO(record);
    }

    @Override
    public MedicalRecordDTO updateMedicalRecord(Long patientId, String recordId, MedicalRecordDTO dto) {
        MedicalRecord existingRecord = medicalRecordRepository.findByIdAndPatientId(recordId, patientId)
            .orElseThrow(() -> new ResourceNotFoundException("Medical Record not found"));
        
        MedicalRecord record = medicalRecordMapper.toEntity(dto);
        record.setId(recordId);
        record.setPatientId(patientId);
        record.setCreatedAt(existingRecord.getCreatedAt());
        record.setUpdatedAt(LocalDateTime.now());
        
        return medicalRecordMapper.toDTO(medicalRecordRepository.save(record));
    }

    @Override
    public Page<MedicalRecordDTO> getPatientMedicalRecords(Long patientId, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return medicalRecordRepository.findByPatientId(patientId, pageRequest)
            .map(medicalRecordMapper::toDTO);
    }
} 