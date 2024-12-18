package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class NotificationDTO {
    private Long id;
    private String type;
    private String message;
    private String recipient;
    private String status;
    private LocalDateTime sentTime;
    private LocalDateTime deliveredTime;
} 