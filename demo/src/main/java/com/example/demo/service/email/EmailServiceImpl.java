package com.example.demo.service.email;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    
    @Override
    public void sendEmail(String to, String subject, String content) {
        // TODO: Implement actual email sending logic
        // For now just log the email
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);
    }
} 