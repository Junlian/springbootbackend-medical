package com.example.demo.model.mongo;

import com.example.demo.model.mongo.enums.AuditAction;
import com.example.demo.model.mongo.enums.EntityType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "audit_trails")
public class AuditTrail {
    @Id
    private String id;
    private EntityType entityType;
    private String entityId;
    private AuditAction action;
    private Long userId;
    private LocalDateTime timestamp;
    private String ipAddress;
    private String userAgent;
} 