package com.example.demo.mapper;

import com.example.demo.dto.AttachmentDTO;
import com.example.demo.model.mongo.Attachment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AttachmentMapper {
    AttachmentDTO toDTO(Attachment attachment);
    Attachment toEntity(AttachmentDTO dto);
} 