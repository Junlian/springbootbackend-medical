package com.example.demo.mapper;

import com.example.demo.dto.NotificationDTO;
import com.example.demo.model.mysql.Notification;
import org.springframework.stereotype.Component;

@Component
public class NotificationMapper {
    
    public Notification toEntity(NotificationDTO dto) {
        if (dto == null) {
            return null;
        }
        Notification notification = new Notification();
        notification.setId(dto.getId());
        notification.setType(dto.getType());
        notification.setMessage(dto.getMessage());
        notification.setRecipient(dto.getRecipient());
        notification.setStatus(dto.getStatus());
        notification.setSentTime(dto.getSentTime());
        notification.setDeliveredTime(dto.getDeliveredTime());
        // appointment is ignored as per original mapping
        return notification;
    }
    
    public NotificationDTO toDTO(Notification notification) {
        if (notification == null) {
            return null;
        }
        NotificationDTO dto = new NotificationDTO();
        dto.setId(notification.getId());
        dto.setType(notification.getType());
        dto.setMessage(notification.getMessage());
        dto.setRecipient(notification.getRecipient());
        dto.setStatus(notification.getStatus());
        dto.setSentTime(notification.getSentTime());
        dto.setDeliveredTime(notification.getDeliveredTime());
        return dto;
    }
} 