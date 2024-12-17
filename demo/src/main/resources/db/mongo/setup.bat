@echo off
echo Starting MongoDB setup...

REM Check if mongos exists
where mongos >nul 2>nul
if %errorlevel% neq 0 (
    echo MongoDB Router (mongos) is not installed or not in PATH
    echo Please install MongoDB Router first
    pause
    exit /b 1
)

REM Run the MongoDB setup script
mongos --configdb configReplSet/localhost:27017 --bind_ip localhost setup.js

if %errorlevel% neq 0 (
    echo Error during MongoDB setup
    pause
    exit /b 1
)

echo MongoDB setup completed successfully
pause