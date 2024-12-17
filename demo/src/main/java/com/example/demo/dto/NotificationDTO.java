package com.example.demo.dto;

import com.example.demo.model.mysql.enums.NotificationType;
import com.example.demo.model.mysql.enums.NotificationStatus;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Map;

@Data
public class NotificationDTO {
    private Long id;
    private Long recipientId;
    private String recipientEmail;
    private String recipientPhone;
    private NotificationType type;
    private String subject;
    private String content;
    private Map<String, Object> parameters;
    private NotificationStatus status;
    private LocalDateTime sentAt;
    private LocalDateTime deliveredAt;
} 