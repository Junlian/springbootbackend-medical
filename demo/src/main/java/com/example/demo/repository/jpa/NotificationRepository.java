package com.example.demo.repository.jpa;

import com.example.demo.model.mysql.Notification;
import com.example.demo.model.mysql.enums.NotificationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    
    List<Notification> findByRecipientIdAndType(Long recipientId, NotificationType type);
    
    @Query("SELECT n FROM Notification n WHERE n.status = 'PENDING' AND n.sentAt IS NULL")
    List<Notification> findPendingNotifications();
    
    @Query("SELECT n FROM Notification n WHERE n.status = 'SENT' AND n.deliveredAt IS NULL")
    List<Notification> findUnconfirmedDeliveries();
} 