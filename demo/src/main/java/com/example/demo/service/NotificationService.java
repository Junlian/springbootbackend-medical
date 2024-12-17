package com.example.demo.service;

import com.example.demo.model.mysql.Appointment;
import com.example.demo.model.mysql.Notification;
import com.example.demo.model.mysql.enums.NotificationType;
import com.example.demo.model.mysql.enums.NotificationStatus;
import com.example.demo.repository.jpa.NotificationRepository;
import com.example.demo.service.email.EmailService;
import com.example.demo.service.sms.SMSService;
import com.example.demo.service.push.PushNotificationService;
import com.example.demo.service.template.TemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class NotificationService {
    
    private final NotificationRepository notificationRepository;
    private final EmailService emailService;
    private final SMSService smsService;
    private final PushNotificationService pushService;
    private final TemplateService templateService;

    @Transactional
    public void sendAppointmentConfirmation(Appointment appointment) {
        Map<String, Object> templateData = Map.of(
            "patientName", appointment.getPatient().getFirstName(),
            "doctorName", appointment.getDoctor().getFirstName() + " " + appointment.getDoctor().getLastName(),
            "dateTime", appointment.getDateTime(),
            "type", appointment.getType()
        );
        
        // Create email notification
        Notification emailNotification = createNotification(
            appointment.getPatient().getId(),
            appointment.getPatient().getEmail(),
            NotificationType.EMAIL,
            "Appointment Confirmation",
            templateService.processTemplate("appointment-confirmation", templateData)
        );
        
        // Create SMS notification if phone number exists
        if (appointment.getPatient().getPhone() != null) {
            Notification smsNotification = createNotification(
                appointment.getPatient().getId(),
                appointment.getPatient().getPhone(),
                NotificationType.SMS,
                "Appointment Reminder",
                templateService.processTemplate("appointment-confirmation-sms", templateData)
            );
            notificationRepository.save(smsNotification);
        }
        
        notificationRepository.save(emailNotification);
    }

    @Transactional
    public void sendReschedulingNotification(Appointment appointment, LocalDateTime oldDateTime) {
        Map<String, Object> templateData = Map.of(
            "patientName", appointment.getPatient().getFirstName(),
            "doctorName", appointment.getDoctor().getFirstName() + " " + appointment.getDoctor().getLastName(),
            "oldDateTime", oldDateTime,
            "newDateTime", appointment.getDateTime()
        );
        
        Notification notification = createNotification(
            appointment.getPatient().getId(),
            appointment.getPatient().getEmail(),
            NotificationType.EMAIL,
            "Appointment Rescheduled",
            templateService.processTemplate("appointment-rescheduled", templateData)
        );
        
        notificationRepository.save(notification);
    }

    @Transactional
    public void sendCancellationNotice(Appointment appointment) {
        Map<String, Object> templateData = Map.of(
            "patientName", appointment.getPatient().getFirstName(),
            "doctorName", appointment.getDoctor().getFirstName() + " " + appointment.getDoctor().getLastName(),
            "dateTime", appointment.getDateTime(),
            "reason", appointment.getCancellationReason()
        );
        
        Notification notification = createNotification(
            appointment.getPatient().getId(),
            appointment.getPatient().getEmail(),
            NotificationType.EMAIL,
            "Appointment Cancelled",
            templateService.processTemplate("appointment-cancelled", templateData)
        );
        
        notificationRepository.save(notification);
    }

    @Scheduled(fixedDelay = 60000) // Run every minute
    @Transactional
    public void processNotificationQueue() {
        notificationRepository.findPendingNotifications()
            .forEach(this::sendNotification);
    }

    private void sendNotification(Notification notification) {
        try {
            switch (notification.getType()) {
                case EMAIL:
                    emailService.sendEmail(
                        notification.getRecipientEmail(),
                        notification.getSubject(),
                        notification.getContent()
                    );
                    break;
                case SMS:
                    smsService.sendSMS(
                        notification.getRecipientPhone(),
                        notification.getContent()
                    );
                    break;
                case PUSH:
                    pushService.sendPushNotification(
                        notification.getRecipientPhone(), // Changed from getRecipientId() to getRecipientPhone()
                        notification.getSubject(),
                        notification.getContent()
                    );
                    break;
            }
            notification.setStatus(NotificationStatus.SENT);
            notification.setSentAt(LocalDateTime.now());
            notificationRepository.save(notification);
            
        } catch (Exception e) {
            notification.setStatus(NotificationStatus.FAILED);
            notification.setErrorMessage(e.getMessage());
            notificationRepository.save(notification);
        }
    }

    private Notification createNotification(
            Long recipientId,
            String recipientContact,
            NotificationType type,
            String subject,
            String content) {
        Notification notification = new Notification();
        notification.setRecipientId(recipientId);
        if (type == NotificationType.EMAIL) {
            notification.setRecipientEmail(recipientContact);
        } else if (type == NotificationType.SMS) {
            notification.setRecipientPhone(recipientContact);
        }
        notification.setType(type);
        notification.setSubject(subject);
        notification.setContent(content);
        return notification;
    }
}