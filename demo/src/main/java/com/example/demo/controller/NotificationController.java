package com.example.demo.controller;

import com.example.demo.dto.NotificationDTO;
import com.example.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send")
    public ResponseEntity<Void> sendNotification(@Valid @RequestBody NotificationDTO notificationDTO) {
        notificationService.sendNotification(notificationDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/status/{appointmentId}")
    public ResponseEntity<NotificationDTO> getNotificationStatus(@PathVariable Long appointmentId) {
        return ResponseEntity.ok(notificationService.getNotificationStatus(appointmentId));
    }

    @PostMapping("/resend/{notificationId}")
    public ResponseEntity<Void> resendNotification(@PathVariable Long notificationId) {
        notificationService.resendNotification(notificationId);
        return ResponseEntity.ok().build();
    }
} 