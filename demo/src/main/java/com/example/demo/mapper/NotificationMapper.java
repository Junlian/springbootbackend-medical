package com.example.demo.mapper;

import com.example.demo.dto.NotificationDTO;
import com.example.demo.model.mysql.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotificationMapper {
    @Mapping(target = "appointment", ignore = true)
    Notification toEntity(NotificationDTO dto);
    
    NotificationDTO toDTO(Notification notification);
} 