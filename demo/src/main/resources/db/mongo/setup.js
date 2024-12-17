const { MongoClient } = require('mongodb');

// Connection URL
const url = 'mongodb://localhost:27017';
const dbName = 'healthcaredb_mongo';

async function setupMongoDB() {
    console.log('Starting MongoDB setup...');
    
    let client;
    try {
        // Connect to MongoDB
        client = await MongoClient.connect(url);
        console.log('Connected to MongoDB server');

        const db = client.db(dbName);

        // Drop existing collections if they exist
        console.log('Dropping existing collections...');
        await Promise.all([
            db.collection('medical_records').drop().catch(() => {}),
            db.collection('prescriptions').drop().catch(() => {}),
            db.collection('audit_trail').drop().catch(() => {})
        ]);

        // Create Medical Records Collection
        console.log('Creating medical_records collection...');
        await db.createCollection("medical_records", {
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
                        }
                        // ... rest of properties
                    }
                }
            }
        });

        // Create Prescriptions Collection
        console.log('Creating prescriptions collection...');
        await db.createCollection("prescriptions", {
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
                        }
                        // ... rest of properties
                    }
                }
            }
        });

        // Create Audit Trail Collection
        console.log('Creating audit_trail collection...');
        await db.createCollection("audit_trail", {
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
                        userId: { bsonType: "long" }
                        // ... rest of properties
                    }
                }
            }
        });

        // Create Indexes
        console.log('Creating indexes...');
        await db.collection('medical_records').createIndex({ "patientId": 1, "date": -1 });
        await db.collection('medical_records').createIndex({ "doctorId": 1 });
        await db.collection('medical_records').createIndex({ "type": 1 });

        await db.collection('prescriptions').createIndex({ "patientId": 1, "status": 1 });
        await db.collection('prescriptions').createIndex({ "prescribedBy": 1 });

        await db.collection('audit_trail').createIndex({ "timestamp": -1 });
        await db.collection('audit_trail').createIndex({ "entityType": 1, "entityId": 1 });

        console.log('MongoDB setup completed successfully');

    } catch (error) {
        console.error('Error during setup:', error);
        process.exit(1);
    } finally {
        if (client) {
            await client.close();
            console.log('MongoDB connection closed');
        }
    }
}

// First install mongodb driver
// npm init -y
// npm install mongodb

// Run the setup
setupMongoDB().catch(console.error);