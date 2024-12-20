package com.example.demo.service.storage;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
    String storeFile(MultipartFile file);
    byte[] getFile(String fileId);
    void deleteFile(String fileId);
} 