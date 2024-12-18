package com.example.demo.service.push;

import org.springframework.stereotype.Service;

@Service
public class PushNotificationServiceImpl implements PushNotificationService {
    
    @Override
    public void sendPushNotification(String userId, String message) {
        // TODO: Implement actual push notification logic
        // For now just log the notification
        System.out.println("Sending push notification to device: " + userId);
        System.out.println("Message: " + message);
    }
} 