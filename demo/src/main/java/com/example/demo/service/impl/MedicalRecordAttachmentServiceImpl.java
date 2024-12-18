package com.example.demo.service.impl;

import com.example.demo.dto.AttachmentDTO;
import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.service.MedicalRecordAttachmentService;
import com.example.demo.repository.mongo.MedicalRecordRepository;
import com.example.demo.service.GridFSFileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicalRecordAttachmentServiceImpl implements MedicalRecordAttachmentService {

    @Autowired
    private GridFSFileStorageService fileStorageService;

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    @Transactional
    public AttachmentDTO uploadAttachment(Long patientId, String recordId, MultipartFile file) {
        // Store file in GridFS
        String fileId = fileStorageService.storeFile(file);
        
        // Create attachment DTO
        AttachmentDTO attachmentDTO = new AttachmentDTO();
        attachmentDTO.setFileId(fileId);
        attachmentDTO.setFileName(file.getOriginalFilename());
        attachmentDTO.setFileType(file.getContentType());
        attachmentDTO.setUploadDate(LocalDateTime.now());

        // Update medical record with attachment reference
        MedicalRecord record = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new RuntimeException("Medical record not found"));

        List<String> attachments = record.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        attachments.add(fileId);
        record.setAttachments(attachments);
        
        medicalRecordRepository.save(record);
        
        return attachmentDTO;
    }

    @Override
    public Resource downloadAttachment(Long patientId, String recordId, String attachmentId) {
        // Verify the attachment belongs to the medical record
        MedicalRecord record = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new RuntimeException("Medical record not found"));

        List<String> attachments = record.getAttachments();
        if (attachments == null || !attachments.contains(attachmentId)) {
            throw new RuntimeException("Attachment not found in medical record");
        }

        // Download file from GridFS
        return fileStorageService.getFile(attachmentId);
    }

    @Override
    public AttachmentDTO addAttachment(String recordId, AttachmentDTO attachmentDTO) {
        MedicalRecord record = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new RuntimeException("Medical record not found"));
        
        List<String> attachments = record.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        attachments.add(attachmentDTO.getFileId());
        record.setAttachments(attachments);
        
        medicalRecordRepository.save(record);
        return attachmentDTO;
    }

    @Override
    public List<AttachmentDTO> getAttachments(String recordId) {
        MedicalRecord record = medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new RuntimeException("Medical record not found"));
        
        List<String> attachmentIds = record.getAttachments();
        if (attachmentIds == null) {
            return new ArrayList<>();
        }
        
        return attachmentIds.stream()
            .map(id -> {
                AttachmentDTO dto = new AttachmentDTO();
                dto.setFileId(id);
                return dto;
            })
            .collect(Collectors.toList());
    }
} 