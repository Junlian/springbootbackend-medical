package com.example.demo.service.impl;

import com.example.demo.dto.NotificationDTO;
import com.example.demo.model.mysql.Notification;
import com.example.demo.repository.NotificationRepository;
import com.example.demo.service.NotificationService;
import com.example.demo.service.email.EmailService;
import com.example.demo.service.sms.SMSService;
import com.example.demo.service.push.PushNotificationService;
import com.example.demo.mapper.NotificationMapper;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;
    
    @Autowired
    private EmailService emailService;
    
    @Autowired
    private SMSService smsService;
    
    @Autowired
    private PushNotificationService pushNotificationService;

    @Autowired
    private NotificationMapper notificationMapper;

    @Override
    public void sendNotification(NotificationDTO dto) {
        Notification notification = notificationMapper.toEntity(dto);
        notification.setSentTime(LocalDateTime.now());
        
        try {
            switch (notification.getType().toUpperCase()) {
                case "EMAIL":
                    emailService.sendEmail(notification.getRecipient(), 
                            "Healthcare Notification", 
                            notification.getMessage());
                    notification.setStatus("SENT");
                    notification.setDeliveredTime(LocalDateTime.now());
                    break;
                    
                case "SMS":
                    smsService.sendSMS(notification.getRecipient(), 
                            notification.getMessage());
                    notification.setStatus("SENT");
                    notification.setDeliveredTime(LocalDateTime.now());
                    break;
                    
                case "PUSH":
                    pushNotificationService.sendPushNotification(
                            notification.getRecipient(), 
                            notification.getMessage());
                    notification.setStatus("SENT");
                    notification.setDeliveredTime(LocalDateTime.now());
                    break;
                    
                default:
                    notification.setStatus("FAILED");
                    throw new IllegalArgumentException("Unsupported notification type: " + notification.getType());
            }
        } catch (Exception e) {
            notification.setStatus("FAILED");
            throw e;
        }
        
        notificationRepository.save(notification);
    }

    @Override
    public NotificationDTO getNotificationStatus(Long appointmentId) {
        Notification notification = notificationRepository.findByAppointment_Id(appointmentId)
            .orElseThrow(() -> new ResourceNotFoundException("Notification not found"));
        return notificationMapper.toDTO(notification);
    }

    @Override
    public void resendNotification(Long notificationId) {
        Notification notification = notificationRepository.findById(notificationId)
            .orElseThrow(() -> new ResourceNotFoundException("Notification not found"));
        NotificationDTO dto = notificationMapper.toDTO(notification);
        sendNotification(dto);
    }
} 