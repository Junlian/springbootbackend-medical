package com.example.demo.repository.mongo;

import com.example.demo.model.mongo.AuditTrail;
import com.example.demo.model.mongo.enums.EntityType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AuditTrailRepository extends MongoRepository<AuditTrail, String> {
    List<AuditTrail> findByEntityTypeAndEntityId(EntityType entityType, String entityId);
    List<AuditTrail> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
    List<AuditTrail> findByUserId(Long userId);
} 