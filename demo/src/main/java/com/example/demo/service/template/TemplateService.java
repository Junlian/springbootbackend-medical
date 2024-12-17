package com.example.demo.service.template;

import java.util.Map;

public interface TemplateService {
    String processTemplate(String templateName, Map<String, Object> variables);
} 