-- Clean up existing data
DELETE FROM appointments;
DELETE FROM doctor_availability;
DELETE FROM doctor_addresses;
DELETE FROM doctors;
DELETE FROM claims;
DELETE FROM insurance_info;
DELETE FROM coverage_details;
DELETE FROM patients;

-- Insert sample patients with address information
INSERT INTO patients (
    first_name,
    last_name,
    email,
    phone,
    status
) VALUES 
    ('John', 'Doe', 'john.doe@email.com', '1234567890', 'ACTIVE'),
    ('Jane', 'Smith', 'jane.smith@email.com', '0987654321', 'ACTIVE');

-- Insert dummy data into doctors table
INSERT IGNORE INTO doctors (
    first_name, 
    last_name, 
    specialization, 
    license_number, 
    email, 
    phone_number,
    status
) VALUES
    ('Dr. Sarah', 'Wilson', 'CARDIOLOGY', 'LIC001', 'dr.wilson@hospital.com', '555-1001', 'ACTIVE'),
    ('Dr. Michael', 'Chen', 'NEUROLOGY', 'LIC002', 'dr.chen@hospital.com', '555-1002', 'ACTIVE'),
    ('Dr. Emily', 'Taylor', 'PEDIATRICS', 'LIC003', 'dr.taylor@hospital.com', '555-1003', 'ACTIVE'),
    ('Dr. James', 'Anderson', 'DERMATOLOGY', 'LIC004', 'dr.anderson@hospital.com', '555-1004', 'ACTIVE'),
    ('Dr. Lisa', 'Martinez', 'PSYCHIATRY', 'LIC005', 'dr.martinez@hospital.com', '555-1005', 'ON_LEAVE');

-- Insert addresses for doctors
INSERT IGNORE INTO doctor_addresses (
    doctor_id, 
    street, 
    city, 
    state, 
    zip_code, 
    is_primary
) VALUES
    (1, '789 Medical Plaza', 'Boston', 'MA', '02114', true),
    (2, '321 Healthcare Blvd', 'Cambridge', 'MA', '02141', true);

-- Insert dummy data into doctor_availability table
INSERT IGNORE INTO doctor_availability (doctor_id, day_of_week, start_time, end_time, is_available) VALUES
(1, 'MONDAY', '09:00', '17:00', true),
(1, 'WEDNESDAY', '09:00', '17:00', true),
(1, 'FRIDAY', '09:00', '13:00', true),
(2, 'TUESDAY', '08:00', '16:00', true),
(2, 'THURSDAY', '08:00', '16:00', true),
(3, 'MONDAY', '10:00', '18:00', true),
(3, 'WEDNESDAY', '10:00', '18:00', true),
(4, 'TUESDAY', '09:00', '17:00', true),
(4, 'THURSDAY', '09:00', '17:00', true),
(5, 'MONDAY', '11:00', '19:00', true);

-- Insert dummy data into appointments table
INSERT IGNORE INTO appointments (
    patient_id, 
    doctor_id, 
    appointment_date_time,
    duration, 
    status, 
    type, 
    reminder_preference, 
    notes
) VALUES
    (1, 1, '2024-03-20 10:00:00', 30, 'SCHEDULED', 'REGULAR', 'EMAIL', 'Regular checkup'),
    (2, 3, '2024-03-21 14:30:00', 45, 'SCHEDULED', 'FOLLOW_UP', 'SMS', 'Follow-up after treatment'),
    (1, 5, '2024-03-23 13:00:00', 45, 'SCHEDULED', 'REGULAR', 'SMS', 'Mental health consultation');

-- Insert coverage details
INSERT INTO coverage_details (
    coverage_type, 
    deductible, 
    copayment, 
    out_of_pocket_max
) VALUES 
    ('BASIC', 1000.00, 30.00, 5000.00),
    ('PREMIUM', 500.00, 20.00, 3000.00),
    ('GOLD', 250.00, 15.00, 2000.00);

-- Insert insurance info
INSERT IGNORE INTO insurance_info (patient_id, provider, policy_number, group_number, valid_from, valid_until, coverage_details_id) VALUES
(1, 'Blue Cross', 'POL-001', 'GRP-001', '2024-01-01', '2024-12-31', 1),
(2, 'Aetna', 'POL-002', 'GRP-002', '2024-01-01', '2024-12-31', 2);

-- Insert test claims
INSERT IGNORE INTO claims (
    policy_id,
    claim_date,
    claim_amount,
    status
) VALUES 
    (1, '2024-01-15', 500.00, 'SUBMITTED'),
    (1, '2024-01-20', 750.00, 'APPROVED'),
    (2, '2024-01-25', 1200.00, 'SUBMITTED'); 