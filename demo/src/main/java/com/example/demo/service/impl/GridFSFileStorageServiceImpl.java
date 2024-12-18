package com.example.demo.service.impl;

import com.example.demo.service.FileStorageService;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.model.GridFSFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Service
public class GridFSFileStorageServiceImpl implements FileStorageService {

    @Autowired
    private GridFsTemplate gridFsTemplate;

    @Autowired
    private GridFsOperations operations;

    @Autowired
    private GridFSBucket gridFSBucket;

    @Override
    public String storeFile(MultipartFile file, String fileName) {
        try {
            return gridFsTemplate.store(
                file.getInputStream(),
                fileName,
                file.getContentType()
            ).toString();
        } catch (IOException e) {
            throw new RuntimeException("Failed to store file", e);
        }
    }

    @Override
    public Resource loadFileAsResource(String fileName) {
        try {
            GridFSFile gridFSFile = gridFsTemplate.findOne(new Query(Criteria.where("filename").is(fileName)));
            if (gridFSFile == null) {
                throw new RuntimeException("File not found");
            }
            return new InputStreamResource(gridFSBucket.openDownloadStream(gridFSFile.getObjectId()));
        } catch (Exception e) {
            throw new RuntimeException("Failed to load file", e);
        }
    }
} 