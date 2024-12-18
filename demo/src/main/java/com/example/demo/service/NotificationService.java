package com.example.demo.service;

import com.example.demo.dto.NotificationDTO;

public interface NotificationService {
    void sendNotification(NotificationDTO dto);
    NotificationDTO getNotificationStatus(Long appointmentId);
    void resendNotification(Long notificationId);
}