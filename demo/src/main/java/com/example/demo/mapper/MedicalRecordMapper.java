package com.example.demo.mapper;

import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.model.mongo.MedicalRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MedicalRecordMapper {
    @Mapping(target = "attachments", expression = "java(mapAttachmentsToStrings(record.getAttachments()))")
    MedicalRecordDTO toDTO(MedicalRecord record);

    @Mapping(target = "attachments", expression = "java(mapStringsToAttachments(dto.getAttachments()))")
    MedicalRecord toEntity(MedicalRecordDTO dto);

    @Mapping(target = "attachments", expression = "java(mapStringsToAttachments(dto.getAttachments()))")
    void updateEntity(MedicalRecordDTO dto, @MappingTarget MedicalRecord record);

    default List<String> mapAttachmentsToStrings(List<MedicalRecord.Attachment> attachments) {
        if (attachments == null) return null;
        return attachments.stream()
            .map(MedicalRecord.Attachment::getFileId)
            .collect(Collectors.toList());
    }

    default List<MedicalRecord.Attachment> mapStringsToAttachments(List<String> fileIds) {
        if (fileIds == null) return null;
        return fileIds.stream()
            .map(fileId -> {
                MedicalRecord.Attachment attachment = new MedicalRecord.Attachment();
                attachment.setFileId(fileId);
                return attachment;
            })
            .collect(Collectors.toList());
    }

    List<MedicalRecordDTO> toDTOList(List<MedicalRecord> records);
} 