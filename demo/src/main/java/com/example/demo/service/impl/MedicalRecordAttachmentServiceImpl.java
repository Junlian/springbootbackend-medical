package com.example.demo.service.impl;

import com.example.demo.dto.AttachmentDTO;
import com.example.demo.model.mongo.Attachment;
import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.repository.MedicalRecordRepository;
import com.example.demo.service.MedicalRecordAttachmentService;
import com.example.demo.service.FileStorageService;
import com.example.demo.mapper.AttachmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import com.example.demo.exception.ResourceNotFoundException;

@Service
public class MedicalRecordAttachmentServiceImpl implements MedicalRecordAttachmentService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    private AttachmentMapper attachmentMapper;

    @Override
    public AttachmentDTO addAttachment(String recordId, AttachmentDTO attachmentDTO) {
        MedicalRecord record = medicalRecordRepository.findById(recordId)
                .orElseThrow(() -> new ResourceNotFoundException("Medical Record not found"));

        Attachment attachment = attachmentMapper.toEntity(attachmentDTO);
        attachment.setMedicalRecordId(recordId);
        attachment.setUploadDate(LocalDateTime.now());

        if (record.getAttachments() == null) {
            record.setAttachments(new ArrayList<>());
        }
        record.getAttachments().add(attachment);
        medicalRecordRepository.save(record);

        return attachmentMapper.toDTO(attachment);
    }

    @Override
    public List<AttachmentDTO> getAttachments(String recordId) {
        MedicalRecord record = medicalRecordRepository.findById(recordId)
                .orElseThrow(() -> new ResourceNotFoundException("Medical Record not found"));

        return record.getAttachments().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private AttachmentDTO convertToDTO(Attachment attachment) {
        AttachmentDTO dto = new AttachmentDTO();
        dto.setId(attachment.getId());
        dto.setFileName(attachment.getFileName());
        dto.setFileType(attachment.getFileType());
        dto.setFilePath(attachment.getFilePath());
        dto.setSize(attachment.getSize());
        dto.setUploadDate(attachment.getUploadDate().toString());
        return dto;
    }

    @Override
    public Resource downloadAttachment(Long recordId, String attachmentId, String fileName) {
        MedicalRecord record = medicalRecordRepository.findById(recordId.toString())
                .orElseThrow(() -> new ResourceNotFoundException("Medical Record not found"));
                
        Attachment attachment = record.getAttachments().stream()
                .filter(a -> a.getId().equals(attachmentId))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Attachment not found"));
                
        return fileStorageService.loadFileAsResource(attachment.getFilePath());
    }

    @Override
    public AttachmentDTO uploadAttachment(Long recordId, String type, MultipartFile file) {
        MedicalRecord record = medicalRecordRepository.findById(recordId.toString())
            .orElseThrow(() -> new ResourceNotFoundException("Medical Record not found"));

        String filePath = fileStorageService.storeFile(file, file.getOriginalFilename());
        
        Attachment attachment = new Attachment();
        attachment.setFileName(file.getOriginalFilename());
        attachment.setFileType(type);
        attachment.setFilePath(filePath);
        attachment.setSize(file.getSize());
        attachment.setUploadDate(LocalDateTime.now());
        attachment.setMedicalRecordId(recordId.toString());

        record.getAttachments().add(attachment);
        medicalRecordRepository.save(record);

        return attachmentMapper.toDTO(attachment);
    }
} 