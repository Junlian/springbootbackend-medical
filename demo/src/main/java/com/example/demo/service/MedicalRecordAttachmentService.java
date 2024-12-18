package com.example.demo.service;

import com.example.demo.dto.AttachmentDTO;
import com.example.demo.model.mongo.Attachment;
import com.example.demo.model.mongo.MedicalRecord;
import java.util.List;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface MedicalRecordAttachmentService {
    AttachmentDTO addAttachment(String recordId, AttachmentDTO attachmentDTO);
    List<AttachmentDTO> getAttachments(String recordId);
    AttachmentDTO uploadAttachment(Long recordId, String type, MultipartFile file);
    Resource downloadAttachment(Long recordId, String attachmentId, String fileName);
} 