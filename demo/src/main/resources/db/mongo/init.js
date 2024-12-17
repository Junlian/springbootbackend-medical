// Switch to the target database
db = db.getSiblingDB('healthcaredb_mongo');

// Drop existing collections if they exist
db.medical_records.drop();
db.prescriptions.drop();
db.audit_trail.drop();

// Create Medical Records Collection
db.createCollection("medical_records", {
    validator: {
        $jsonSchema: {
            bsonType: "object",
            required: ["patientId", "date", "type", "status"],
            properties: {
                patientId: { bsonType: "long" },
                doctorId: { bsonType: "long" },
                date: { bsonType: "date" },
                type: { 
                    enum: ["CONSULTATION", "LAB_RESULT", "IMAGING", "PRESCRIPTION", "PROCEDURE"] 
                },
                status: {
                    enum: ["DRAFT", "FINAL", "AMENDED", "DELETED"]
                },
                diagnosis: { bsonType: "string" },
                notes: { bsonType: "string" },
                attachments: {
                    bsonType: "array",
                    items: {
                        bsonType: "object",
                        required: ["fileId", "fileName", "fileType"],
                        properties: {
                            fileId: { bsonType: "objectId" },
                            fileName: { bsonType: "string" },
                            fileType: { bsonType: "string" },
                            uploadDate: { bsonType: "date" }
                        }
                    }
                },
                metadata: {
                    bsonType: "object",
                    properties: {
                        facility: { bsonType: "string" },
                        department: { bsonType: "string" },
                        createdBy: { bsonType: "long" },
                        lastModifiedBy: { bsonType: "long" }
                    }
                }
            }
        }
    }
});

print("Created medical_records collection");

// Create Prescriptions Collection
db.createCollection("prescriptions", {
    validator: {
        $jsonSchema: {
            bsonType: "object",
            required: ["patientId", "medication", "prescribedBy", "startDate"],
            properties: {
                patientId: { bsonType: "long" },
                medication: { bsonType: "string" },
                dosage: { bsonType: "string" },
                frequency: { bsonType: "string" },
                startDate: { bsonType: "date" },
                endDate: { bsonType: "date" },
                prescribedBy: { bsonType: "long" },
                status: {
                    enum: ["ACTIVE", "COMPLETED", "CANCELLED"]
                },
                refills: { bsonType: "int" },
                pharmacy: {
                    bsonType: "object",
                    properties: {
                        name: { bsonType: "string" },
                        address: { bsonType: "string" },
                        phone: { bsonType: "string" }
                    }
                }
            }
        }
    }
});

print("Created prescriptions collection");

// Create Indexes
db.medical_records.createIndex({ "patientId": 1, "date": -1 });
db.medical_records.createIndex({ "doctorId": 1 });
db.medical_records.createIndex({ "type": 1 });

db.prescriptions.createIndex({ "patientId": 1, "status": 1 });
db.prescriptions.createIndex({ "prescribedBy": 1 });

print("Created indexes for medical_records and prescriptions");

// Create Audit Trail Collection
db.createCollection("audit_trail", {
    validator: {
        $jsonSchema: {
            bsonType: "object",
            required: ["timestamp", "action", "entityType", "entityId", "userId"],
            properties: {
                timestamp: { bsonType: "date" },
                action: { 
                    enum: ["CREATE", "READ", "UPDATE", "DELETE"] 
                },
                entityType: { 
                    enum: ["MEDICAL_RECORD", "PRESCRIPTION", "ATTACHMENT"] 
                },
                entityId: { bsonType: "objectId" },
                userId: { bsonType: "long" },
                changes: { bsonType: "object" },
                ipAddress: { bsonType: "string" },
                userAgent: { bsonType: "string" }
            }
        }
    }
});

db.audit_trail.createIndex({ "timestamp": -1 });
db.audit_trail.createIndex({ "entityType": 1, "entityId": 1 });

print("Created audit_trail collection and indexes");
print("MongoDB setup completed successfully"); 