package com.example.demo.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface GridFSFileStorageService {
    String storeFile(MultipartFile file);
    Resource getFile(String fileId);
} 