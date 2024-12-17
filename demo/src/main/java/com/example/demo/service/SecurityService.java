package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class SecurityService {
    public Long getCurrentUserId() {
        // TODO: Implement actual security logic
        return 1L; // Default user ID for now
    }
    
    public String getCurrentUserIp() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            return request.getRemoteAddr();
        }
        return "unknown";
    }
    
    public String getCurrentUserAgent() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            return request.getHeader("User-Agent");
        }
        return "unknown";
    }
}