package com.example.demo.service.email;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
    void sendEmail(String to, String subject, String content);
}