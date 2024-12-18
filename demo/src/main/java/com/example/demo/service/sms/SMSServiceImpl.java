package com.example.demo.service.sms;

import org.springframework.stereotype.Service;

@Service
public class SMSServiceImpl implements SMSService {
    
    @Override
    public void sendSMS(String to, String message) {
        // TODO: Implement actual SMS sending logic
        // For now just log the SMS
        System.out.println("Sending SMS to: " + to);
        System.out.println("Message: " + message);
    }
} 