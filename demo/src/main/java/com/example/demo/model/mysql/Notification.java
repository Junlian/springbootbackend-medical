package com.example.demo.model.mysql;

import com.example.demo.model.mysql.enums.NotificationType;
import com.example.demo.model.mysql.enums.NotificationStatus;
import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long recipientId;
    
    private String recipientEmail;
    private String recipientPhone;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private NotificationType type;
    
    @Column(nullable = false)
    private String subject;
    
    @Column(columnDefinition = "TEXT")
    private String content;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private NotificationStatus status = NotificationStatus.PENDING;
    
    private LocalDateTime sentAt;
    private LocalDateTime deliveredAt;
    private String errorMessage;
}