const { MongoClient, ObjectId, Long } = require('mongodb');

// Connection URL
const url = 'mongodb://localhost:27017';
const dbName = 'healthcaredb_mongo';

async function insertDummyData() {
    console.log('Starting to insert dummy data...');
    
    let client;
    try {
        // Connect to MongoDB
        client = await MongoClient.connect(url);
        console.log('Connected to MongoDB server');

        const db = client.db(dbName);

        // Insert Medical Records
        console.log('Inserting medical records...');
        const medicalRecords = [
            {
                _id: new ObjectId(),
                patientId: Long.fromNumber(1),
                doctorId: Long.fromNumber(1),
                date: new Date("2024-03-15"),
                type: "CONSULTATION",
                status: "FINAL",
                diagnosis: "Hypertension",
                notes: "Patient presents with elevated blood pressure"
            },
            {
                _id: new ObjectId(),
                patientId: Long.fromNumber(2),
                doctorId: Long.fromNumber(3),
                date: new Date("2024-03-16"),
                type: "LAB_RESULT",
                status: "FINAL",
                diagnosis: "Normal blood work",
                notes: "All parameters within normal range"
            },
            {
                _id: new ObjectId(),
                patientId: Long.fromNumber(3),
                doctorId: Long.fromNumber(2),
                date: new Date("2024-03-17"),
                type: "IMAGING",
                status: "DRAFT",
                diagnosis: "Pending radiology review",
                notes: "Chest X-ray taken, awaiting radiologist report"
            },
            {
                _id: new ObjectId(),
                patientId: Long.fromNumber(4),
                doctorId: Long.fromNumber(4),
                date: new Date("2024-03-18"),
                type: "PROCEDURE",
                status: "FINAL",
                diagnosis: "Successful procedure",
                notes: "Minor surgical procedure completed without complications"
            }
        ];

        await db.collection('medical_records').insertMany(medicalRecords);

        // Insert Prescriptions
        console.log('Inserting prescriptions...');
        const prescriptions = [
            {
                _id: new ObjectId(),
                patientId: Long.fromNumber(1),
                medication: "Lisinopril",
                dosage: "10mg",
                frequency: "Once daily",
                startDate: new Date("2024-03-15"),
                endDate: new Date("2024-06-15"),
                prescribedBy: Long.fromNumber(1),
                status: "ACTIVE",
                refills: NumberInt(3)
            },
            {
                _id: new ObjectId(),
                patientId: Long.fromNumber(2),
                medication: "Amoxicillin",
                dosage: "500mg",
                frequency: "Three times daily",
                startDate: new Date("2024-03-16"),
                endDate: new Date("2024-03-23"),
                prescribedBy: Long.fromNumber(3),
                status: "ACTIVE",
                refills: NumberInt(0)
            }
        ];

        await db.collection('prescriptions').insertMany(prescriptions);

        // Create sequential timestamps for audit trail
        const now = new Date();
        const auditTrails = [
            {
                _id: new ObjectId(),
                timestamp: new Date(now.getTime()),
                action: "CREATE",
                entityType: "MEDICAL_RECORD",
                entityId: medicalRecords[0]._id,  // Reference to actual medical record
                userId: Long.fromNumber(1)
            },
            {
                _id: new ObjectId(),
                timestamp: new Date(now.getTime() + 1000),  // 1 second later
                action: "UPDATE",
                entityType: "PRESCRIPTION",
                entityId: prescriptions[0]._id,  // Reference to actual prescription
                userId: Long.fromNumber(1)
            },
            {
                _id: new ObjectId(),
                timestamp: new Date(now.getTime() + 2000),  // 2 seconds later
                action: "CREATE",
                entityType: "MEDICAL_RECORD",
                entityId: medicalRecords[1]._id,
                userId: Long.fromNumber(3)
            }
        ];

        await db.collection('audit_trail').insertMany(auditTrails);

        // Verify indexes
        console.log('Verifying indexes...');
        const auditIndexes = await db.collection('audit_trail').indexes();
        console.log('Audit Trail Indexes:', JSON.stringify(auditIndexes, null, 2));

        console.log('Dummy data insertion completed successfully');

    } catch (error) {
        console.error('Error inserting dummy data:', error);
        if (error.writeErrors) {
            console.error('Validation errors:', JSON.stringify(error.writeErrors[0].err, null, 2));
        }
        process.exit(1);
    } finally {
        if (client) {
            await client.close();
            console.log('MongoDB connection closed');
        }
    }
}

// Helper function for integer values
function NumberInt(value) {
    return { $numberInt: value.toString() };
}

// Run the data insertion
insertDummyData().catch(console.error); 