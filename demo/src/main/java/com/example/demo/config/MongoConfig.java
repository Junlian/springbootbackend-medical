package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.demo.repository.mongo")
public class MongoConfig extends AbstractMongoClientConfiguration {
    
    @Override
    protected String getDatabaseName() {
        return "healthcaredb_mongo";
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017/healthcaredb_mongo");
    }
} 