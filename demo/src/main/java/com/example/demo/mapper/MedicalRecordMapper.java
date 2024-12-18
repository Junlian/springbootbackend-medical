package com.example.demo.mapper;

import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.model.mongo.Attachment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {AttachmentMapper.class})
public interface MedicalRecordMapper {
    
    @Mapping(target = "attachments", ignore = true)
    MedicalRecordDTO toDTO(MedicalRecord medicalRecord);
    
    @Mapping(target = "attachments", ignore = true)
    MedicalRecord toEntity(MedicalRecordDTO dto);
} 