-- MySQL Schema for Healthcare System

-- Patients Table
CREATE TABLE IF NOT EXISTS patients (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(15),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status ENUM('ACTIVE', 'INACTIVE', 'BLOCKED') DEFAULT 'ACTIVE',
    INDEX idx_email (email),
    INDEX idx_name (last_name, first_name)
) ENGINE=InnoDB;

-- Addresses Table
CREATE TABLE IF NOT EXISTS addresses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    entity_id BIGINT NOT NULL,
    entity_type ENUM('PATIENT', 'DOCTOR') NOT NULL,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state VARCHAR(50) NOT NULL,
    zip_code VARCHAR(20) NOT NULL,
    country VARCHAR(50) DEFAULT 'USA',
    is_primary BOOLEAN DEFAULT TRUE,
    INDEX idx_entity (entity_id, entity_type)
) ENGINE=InnoDB;

-- Doctors Table
CREATE TABLE IF NOT EXISTS doctors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    specialization ENUM('CARDIOLOGY', 'DERMATOLOGY', 'NEUROLOGY', 'PEDIATRICS', 'PSYCHIATRY') NOT NULL,
    license_number VARCHAR(15) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(15),
    status ENUM('ACTIVE', 'INACTIVE', 'ON_LEAVE') DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_specialization (specialization),
    INDEX idx_license (license_number)
) ENGINE=InnoDB;

-- Doctor Availability Table
CREATE TABLE IF NOT EXISTS doctor_availability (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    doctor_id BIGINT NOT NULL,
    day_of_week ENUM('MONDAY', 'TUESDAY', 'WEDNESDAY', 'THURSDAY', 'FRIDAY', 'SATURDAY', 'SUNDAY') NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    is_available BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (doctor_id) REFERENCES doctors(id),
    INDEX idx_doctor_schedule (doctor_id, day_of_week)
) ENGINE=InnoDB;

-- Appointments Table
CREATE TABLE IF NOT EXISTS appointments (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    doctor_id BIGINT NOT NULL,
    appointment_time DATETIME NOT NULL,
    duration INT DEFAULT 30,
    status ENUM('SCHEDULED', 'COMPLETED', 'CANCELLED', 'NO_SHOW') DEFAULT 'SCHEDULED',
    type ENUM('REGULAR', 'FOLLOW_UP', 'EMERGENCY') NOT NULL,
    reminder_preference ENUM('EMAIL', 'SMS', 'BOTH', 'NONE') DEFAULT 'EMAIL',
    notes TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES patients(id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(id),
    INDEX idx_appointment_time (appointment_time),
    INDEX idx_patient_doctor (patient_id, doctor_id)
) ENGINE=InnoDB;

-- Insurance Information Table
CREATE TABLE IF NOT EXISTS insurance_info (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    provider VARCHAR(100) NOT NULL,
    policy_number VARCHAR(20) NOT NULL,
    group_number VARCHAR(20),
    valid_from DATE NOT NULL,
    valid_until DATE NOT NULL,
    FOREIGN KEY (patient_id) REFERENCES patients(id),
    INDEX idx_policy (policy_number)
) ENGINE=InnoDB; 