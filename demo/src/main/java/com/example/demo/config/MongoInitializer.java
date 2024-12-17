package com.example.demo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;

@Configuration
public class MongoInitializer {

    @Autowired
    private MongoClient mongoClient;

    @Bean
    public CommandLineRunner initializeMongoDB() {
        return args -> {
            Resource setupScript = new ClassPathResource("db/mongo/setup.js");
            MongoDatabase database = mongoClient.getDatabase("healthcaredb_mongo");
            
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(setupScript.getInputStream(), StandardCharsets.UTF_8))) {
                
                // Read the script and split into individual commands
                String[] commands = reader.lines()
                    .collect(Collectors.joining("\n"))
                    .split(";");
                
                // Execute each command separately
                Arrays.stream(commands)
                    .map(String::trim)
                    .filter(cmd -> !cmd.isEmpty())
                    .forEach(cmd -> {
                        try {
                            // Parse the command as a Document and execute
                            Document commandDoc = Document.parse(cmd);
                            database.runCommand(commandDoc);
                        } catch (Exception e) {
                            // Log the error but continue with other commands
                            System.err.println("Error executing command: " + cmd);
                            e.printStackTrace();
                        }
                    });
            }
        };
    }
} 