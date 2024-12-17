-- Create the database if it doesn't exist
CREATE DATABASE IF NOT EXISTS healthcaredb;
USE healthcaredb;

-- Grant privileges to root user
GRANT ALL PRIVILEGES ON healthcaredb.* TO 'root'@'localhost' IDENTIFIED BY '1234';
FLUSH PRIVILEGES; 