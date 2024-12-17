package com.example.demo.service.push;

public interface PushNotificationService {
    void sendPushNotification(String deviceToken, String title, String message);
} 