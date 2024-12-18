package com.example.demo.service.email;

public interface EmailService {
    void sendEmail(String to, String subject, String content);
}