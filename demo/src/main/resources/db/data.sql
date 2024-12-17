-- Insert dummy data into patients table
INSERT INTO patients (first_name, last_name, date_of_birth, email, phone_number, status) VALUES
('John', 'Doe', '1980-06-15', 'john.doe@email.com', '555-0101', 'ACTIVE'),
('Jane', 'Smith', '1992-03-22', 'jane.smith@email.com', '555-0102', 'ACTIVE'),
('Robert', 'Johnson', '1975-11-08', 'robert.j@email.com', '555-0103', 'ACTIVE'),
('Maria', 'Garcia', '1988-09-30', 'maria.g@email.com', '555-0104', 'ACTIVE'),
('William', 'Brown', '1965-04-17', 'william.b@email.com', '555-0105', 'INACTIVE');

-- Insert dummy data into doctors table
INSERT INTO doctors (first_name, last_name, specialization, license_number, email, phone_number, status) VALUES
('Dr. Sarah', 'Wilson', 'CARDIOLOGY', 'LIC001', 'dr.wilson@hospital.com', '555-1001', 'ACTIVE'),
('Dr. Michael', 'Chen', 'NEUROLOGY', 'LIC002', 'dr.chen@hospital.com', '555-1002', 'ACTIVE'),
('Dr. Emily', 'Taylor', 'PEDIATRICS', 'LIC003', 'dr.taylor@hospital.com', '555-1003', 'ACTIVE'),
('Dr. James', 'Anderson', 'DERMATOLOGY', 'LIC004', 'dr.anderson@hospital.com', '555-1004', 'ACTIVE'),
('Dr. Lisa', 'Martinez', 'PSYCHIATRY', 'LIC005', 'dr.martinez@hospital.com', '555-1005', 'ON_LEAVE');

-- Insert dummy data into addresses table
INSERT INTO addresses (entity_id, entity_type, street, city, state, zip_code, is_primary) VALUES
(1, 'PATIENT', '123 Main St', 'Boston', 'MA', '02108', true),
(2, 'PATIENT', '456 Oak Ave', 'Cambridge', 'MA', '02139', true),
(1, 'DOCTOR', '789 Medical Plaza', 'Boston', 'MA', '02114', true),
(2, 'DOCTOR', '321 Healthcare Blvd', 'Cambridge', 'MA', '02141', true),
(3, 'PATIENT', '555 Pine St', 'Somerville', 'MA', '02143', true);

-- Insert dummy data into doctor_availability table
INSERT INTO doctor_availability (doctor_id, day_of_week, start_time, end_time, is_available) VALUES
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
INSERT INTO appointments (patient_id, doctor_id, appointment_time, duration, status, type, reminder_preference, notes) VALUES
(1, 1, '2024-03-20 10:00:00', 30, 'SCHEDULED', 'REGULAR', 'EMAIL', 'Regular checkup'),
(2, 3, '2024-03-21 14:30:00', 45, 'SCHEDULED', 'FOLLOW_UP', 'SMS', 'Follow-up after treatment'),
(3, 2, '2024-03-22 11:00:00', 60, 'SCHEDULED', 'REGULAR', 'BOTH', 'Initial consultation'),
(4, 4, '2024-03-20 15:00:00', 30, 'SCHEDULED', 'REGULAR', 'EMAIL', 'Skin examination'),
(1, 5, '2024-03-23 13:00:00', 45, 'SCHEDULED', 'REGULAR', 'SMS', 'Mental health consultation');

-- Insert dummy data into insurance_info table
INSERT INTO insurance_info (patient_id, provider, policy_number, group_number, valid_from, valid_until) VALUES
(1, 'Blue Cross', 'POL-001', 'GRP-001', '2024-01-01', '2024-12-31'),
(2, 'Aetna', 'POL-002', 'GRP-002', '2024-01-01', '2024-12-31'),
(3, 'United Health', 'POL-003', 'GRP-003', '2024-01-01', '2024-12-31'),
(4, 'Cigna', 'POL-004', 'GRP-004', '2024-01-01', '2024-12-31'),
(5, 'Humana', 'POL-005', 'GRP-005', '2024-01-01', '2024-12-31'); 