-- MySQL Schema for Healthcare System

-- First create the patients table since it's referenced by others
CREATE TABLE IF NOT EXISTS patients (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(15),
    status VARCHAR(20) DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    INDEX idx_email (email),
    INDEX idx_phone (phone)
) ENGINE=InnoDB;

-- Create coverage_details table before insurance_info
CREATE TABLE IF NOT EXISTS coverage_details (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    coverage_type VARCHAR(50) NOT NULL,
    deductible DECIMAL(10,2),
    copayment DECIMAL(10,2),
    out_of_pocket_max DECIMAL(10,2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;

-- Create insurance_info table
CREATE TABLE IF NOT EXISTS insurance_info (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    provider VARCHAR(100) NOT NULL,
    policy_number VARCHAR(20) NOT NULL,
    group_number VARCHAR(20),
    valid_from DATE NOT NULL,
    valid_until DATE NOT NULL,
    coverage_details_id BIGINT,
    FOREIGN KEY (patient_id) REFERENCES patients(id),
    FOREIGN KEY (coverage_details_id) REFERENCES coverage_details(id),
    INDEX idx_policy (policy_number)
) ENGINE=InnoDB;

-- Create doctors table before doctor-related tables
CREATE TABLE IF NOT EXISTS doctors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    specialization VARCHAR(50) NOT NULL,
    license_number VARCHAR(15) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(15),
    status VARCHAR(20) DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_specialization (specialization),
    INDEX idx_license (license_number)
) ENGINE=InnoDB;

-- Create doctor_addresses table
CREATE TABLE IF NOT EXISTS doctor_addresses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    doctor_id BIGINT NOT NULL,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state VARCHAR(50) NOT NULL,
    zip_code VARCHAR(20) NOT NULL,
    country VARCHAR(50) DEFAULT 'USA',
    is_primary BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (doctor_id) REFERENCES doctors(id),
    INDEX idx_doctor (doctor_id)
) ENGINE=InnoDB;

-- Create doctor_availability table
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

-- Create appointments table
CREATE TABLE IF NOT EXISTS appointments (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    doctor_id BIGINT NOT NULL,
    appointment_date_time DATETIME NOT NULL,
    duration INT DEFAULT 30,
    status ENUM('SCHEDULED', 'COMPLETED', 'CANCELLED', 'NO_SHOW') DEFAULT 'SCHEDULED',
    type ENUM('REGULAR', 'FOLLOW_UP', 'EMERGENCY') NOT NULL,
    reminder_preference ENUM('EMAIL', 'SMS', 'BOTH', 'NONE') DEFAULT 'EMAIL',
    notes TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES patients(id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(id),
    INDEX idx_appointment_date_time (appointment_date_time),
    INDEX idx_patient_doctor (patient_id, doctor_id)
) ENGINE=InnoDB;

-- Create claims table
CREATE TABLE IF NOT EXISTS claims (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    policy_id BIGINT NOT NULL,
    claim_date DATE NOT NULL,
    claim_amount DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    FOREIGN KEY (policy_id) REFERENCES insurance_info(id)
) ENGINE=InnoDB; 