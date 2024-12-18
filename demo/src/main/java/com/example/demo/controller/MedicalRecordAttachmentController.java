package com.example.demo.controller;

import com.example.demo.dto.AttachmentDTO;
import com.example.demo.service.MedicalRecordAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/medical-records/{patientId}/{recordId}/attachments")
public class MedicalRecordAttachmentController {

    @Autowired
    private MedicalRecordAttachmentService attachmentService;

    @PostMapping
    public ResponseEntity<AttachmentDTO> uploadAttachment(
            @PathVariable Long patientId,
            @PathVariable String recordId,
            @RequestParam("file") MultipartFile file) {
        // Validate file
        if (file.isEmpty()) {
            throw new IllegalArgumentException("File cannot be empty");
        }
        // Validate file type
        String contentType = file.getContentType();
        if (contentType == null || !contentType.startsWith("image/")) {
            throw new IllegalArgumentException("Only image files are allowed");
        }
        
        AttachmentDTO attachment = attachmentService.uploadAttachment(patientId, recordId, file);
        return ResponseEntity.ok(attachment);
    }

    @GetMapping("/{attachmentId}")
    public ResponseEntity<Resource> downloadAttachment(
            @PathVariable Long patientId,
            @PathVariable String recordId,
            @PathVariable String attachmentId) {
        Resource resource = attachmentService.downloadAttachment(patientId, recordId, attachmentId);
        
        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
            .body(resource);
    }
} 