package com.example.demo.service;

import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.model.mongo.AuditTrail;
import com.example.demo.model.mongo.enums.AuditAction;
import com.example.demo.model.mongo.enums.EntityType;
import com.example.demo.repository.mongo.MedicalRecordRepository;
import com.example.demo.repository.mongo.AuditTrailRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.MedicalRecordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import com.example.demo.service.storage.FileStorageService;
import com.example.demo.service.SecurityService;

@Service
@RequiredArgsConstructor
public class MedicalRecordService {
    
    private final MedicalRecordRepository medicalRecordRepository;
    private final AuditTrailRepository auditTrailRepository;
    private final MedicalRecordMapper medicalRecordMapper;
    private final FileStorageService fileStorageService;
    private final SecurityService securityService;

    @Transactional
    public MedicalRecordDTO createRecord(MedicalRecordDTO recordDTO) {
        MedicalRecord record = medicalRecordMapper.toEntity(recordDTO);
        record.setDate(LocalDateTime.now());
        record = medicalRecordRepository.save(record);
        
        createAuditTrail(record.getId(), AuditAction.CREATE);
        
        return medicalRecordMapper.toDTO(record);
    }

    @Transactional
    public MedicalRecordDTO updateRecord(String id, MedicalRecordDTO recordDTO) {
        MedicalRecord record = medicalRecordRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Medical record not found"));
            
        medicalRecordMapper.updateEntity(recordDTO, record);
        record = medicalRecordRepository.save(record);
        
        createAuditTrail(record.getId(), AuditAction.UPDATE);
        
        return medicalRecordMapper.toDTO(record);
    }

    @Transactional(readOnly = true)
    public MedicalRecordDTO getRecord(String id) {
        MedicalRecord record = medicalRecordRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Medical record not found"));
            
        createAuditTrail(record.getId(), AuditAction.READ);
        
        return medicalRecordMapper.toDTO(record);
    }

    @Transactional(readOnly = true)
    public List<MedicalRecordDTO> getPatientHistory(Long patientId) {
        List<MedicalRecord> records = medicalRecordRepository.findByPatientIdOrderByDateDesc(patientId);
        return medicalRecordMapper.toDTOList(records);
    }

    @Transactional
    public void attachDocument(String recordId, MultipartFile file) {
        MedicalRecord record = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new ResourceNotFoundException("Medical record not found"));
            
        String fileId = fileStorageService.storeFile(file);
        
        MedicalRecord.Attachment attachment = new MedicalRecord.Attachment();
        attachment.setFileId(fileId);
        attachment.setFileName(file.getOriginalFilename());
        attachment.setFileType(file.getContentType());
        attachment.setUploadDate(LocalDateTime.now());
        
        record.getAttachments().add(attachment);
        medicalRecordRepository.save(record);
        
        createAuditTrail(record.getId(), AuditAction.UPDATE);
    }

    @Transactional(readOnly = true)
    public byte[] getDocument(String recordId, String fileId) {
        MedicalRecord record = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new ResourceNotFoundException("Medical record not found"));
            
        boolean hasAccess = record.getAttachments().stream()
            .anyMatch(attachment -> attachment.getFileId().equals(fileId));
            
        if (!hasAccess) {
            throw new ResourceNotFoundException("File not found in record");
        }
        
        createAuditTrail(record.getId(), AuditAction.READ);
        
        return fileStorageService.getFile(fileId);
    }

    private void createAuditTrail(String entityId, AuditAction action) {
        AuditTrail audit = new AuditTrail();
        audit.setEntityType(EntityType.MEDICAL_RECORD);
        audit.setEntityId(entityId);
        audit.setAction(action);
        audit.setUserId(securityService.getCurrentUserId());
        audit.setTimestamp(LocalDateTime.now());
        audit.setIpAddress(securityService.getCurrentUserIp());
        audit.setUserAgent(securityService.getCurrentUserAgent());
        
        auditTrailRepository.save(audit);
    }
}