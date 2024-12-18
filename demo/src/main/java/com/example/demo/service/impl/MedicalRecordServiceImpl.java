package com.example.demo.service.impl;

import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.repository.mongo.MedicalRecordRepository;
import com.example.demo.service.MedicalRecordService;
import com.example.demo.mapper.MedicalRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;
    
    @Autowired
    private MedicalRecordMapper medicalRecordMapper;

    @Override
    public Page<MedicalRecordDTO> getPatientMedicalRecords(Long patientId, int page, int size) {
        Page<MedicalRecord> records = medicalRecordRepository.findByPatientId(
            patientId, 
            PageRequest.of(page, size)
        );
        return records.map(medicalRecordMapper::toDTO);
    }

    @Override
    @Transactional
    public MedicalRecordDTO createMedicalRecord(Long patientId, MedicalRecordDTO medicalRecordDTO) {
        MedicalRecord record = medicalRecordMapper.toEntity(medicalRecordDTO);
        record.setPatientId(patientId);
        MedicalRecord savedRecord = medicalRecordRepository.save(record);
        return medicalRecordMapper.toDTO(savedRecord);
    }

    @Override
    public MedicalRecordDTO getMedicalRecord(String recordId) {
        MedicalRecord record = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new RuntimeException("Medical record not found"));
        return medicalRecordMapper.toDTO(record);
    }

    @Override
    @Transactional
    public MedicalRecordDTO updateMedicalRecord(String recordId, MedicalRecordDTO medicalRecordDTO) {
        MedicalRecord existingRecord = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new RuntimeException("Medical record not found"));
        
        MedicalRecord updatedRecord = medicalRecordMapper.toEntity(medicalRecordDTO);
        updatedRecord.setId(recordId);
        updatedRecord.setPatientId(existingRecord.getPatientId());
        
        MedicalRecord savedRecord = medicalRecordRepository.save(updatedRecord);
        return medicalRecordMapper.toDTO(savedRecord);
    }

    @Override
    @Transactional
    public void deleteMedicalRecord(String recordId) {
        if (!medicalRecordRepository.existsById(recordId)) {
            throw new RuntimeException("Medical record not found");
        }
        medicalRecordRepository.deleteById(recordId);
    }
} 