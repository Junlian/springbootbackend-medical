package com.example.demo.service;

import java.util.Map;

public interface TemplateService {
    String processTemplate(String templateName, Map<String, Object> data);
} 