#!/bin/bash

# MongoDB connection details
MONGO_HOST="localhost"
MONGO_PORT="27017"
DB_NAME="healthcaredb_mongo"

echo "Starting MongoDB setup..."

# Run the setup script
mongosh "mongodb://$MONGO_HOST:$MONGO_PORT" --file setup.js

# Check if the script executed successfully
if [ $? -eq 0 ]; then
    echo "MongoDB setup completed successfully"
else
    echo "Error during MongoDB setup"
    exit 1
fi 