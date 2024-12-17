package com.example.demo.service.storage;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileStorageServiceImpl implements FileStorageService {
    
    private final Path fileStorageLocation;
    
    public FileStorageServiceImpl() {
        this.fileStorageLocation = Paths.get("uploads").toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (IOException ex) {
            throw new RuntimeException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }
    
    @Override
    public String storeFile(MultipartFile file) {
        String fileId = UUID.randomUUID().toString();
        try {
            Path targetLocation = this.fileStorageLocation.resolve(fileId);
            Files.copy(file.getInputStream(), targetLocation);
            return fileId;
        } catch (IOException ex) {
            throw new RuntimeException("Could not store file. Please try again!", ex);
        }
    }
    
    @Override
    public byte[] getFile(String fileId) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileId);
            return Files.readAllBytes(filePath);
        } catch (IOException ex) {
            throw new RuntimeException("File not found " + fileId, ex);
        }
    }
    
    @Override
    public void deleteFile(String fileId) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileId);
            Files.deleteIfExists(filePath);
        } catch (IOException ex) {
            throw new RuntimeException("Could not delete file " + fileId, ex);
        }
    }
} 