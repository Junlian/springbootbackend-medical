package com.example.demo.service.push;

import org.springframework.stereotype.Service;

@Service
public class PushNotificationServiceImpl implements PushNotificationService {
    
    @Override
    public void sendPushNotification(String deviceToken, String title, String message) {
        // TODO: Implement actual push notification logic
        // For now just log the notification
        System.out.println("Sending push notification to device: " + deviceToken);
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }
} 