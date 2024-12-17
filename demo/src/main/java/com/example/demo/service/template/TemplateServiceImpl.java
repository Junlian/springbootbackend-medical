package com.example.demo.service.template;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class TemplateServiceImpl implements TemplateService {
    
    @Override
    public String processTemplate(String templateName, Map<String, Object> variables) {
        // TODO: Implement actual template processing logic
        // For now return a simple string with variables
        StringBuilder result = new StringBuilder();
        result.append("Template: ").append(templateName).append("\n");
        variables.forEach((key, value) -> 
            result.append(key).append(": ").append(value).append("\n")
        );
        return result.toString();
    }
} 