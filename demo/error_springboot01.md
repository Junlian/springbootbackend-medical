PS D:\laizi360xiazai\project-bolt-sb1-sdmzvcekHealthCareManagement\demospringboot002\demo> mvn clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.3.2:clean (default-clean) @ demo ---
[INFO] Deleting D:\laizi360xiazai\project-bolt-sb1-sdmzvcekHealthCareManagement\demospringboot002\demo\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ demo ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 588 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 73 source files with javac [debug release 21] to target\classes
[INFO] Annotation processing is enabled because one or more processors were found
  on the class path. A future release of javac may disable annotation processing
  unless at least one processor is specified by name (-processor), or a search
  path is specified (--processor-path, --processor-module-path), or annotation
  processing is enabled explicitly (-proc:only, -proc:full).
  Use -Xlint:-options to suppress this message.
  Use -proc:none to disable annotation processing.
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Medi
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/MedicalRecord.java:[53,8] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Medi
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/MedicalRecord.java:[63,8] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Pres
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Prescription.java:[37,8] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDT
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDTO.java:[10,8] class MedicalRecordDTO is public, should be declared in a file named MedicalRecordDTO.java
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDT
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDTO.java:[24,15] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDT
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDTO.java:[32,15] class MetadataDTO is public, should be declared in a file named MetadataDTO.java
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[10,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[11,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Pati
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Patient.java:[9,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Pati
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Patient.java:[10,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[8,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[9,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[9,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[10,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Emer
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/EmergencyContact.java:[7,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Emer
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/EmergencyContact.java:[8,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[6,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[5,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Pati
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Patient.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Emer
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/EmergencyContact.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Appointm
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/AppointmentService.java:[10,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Appointm
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/AppointmentService.java:[11,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[6,38] package com.example.demo.service.email does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[7,36] package com.example.demo.service.sms does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[8,37] package com.example.demo.service.push does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Appointm
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/AppointmentService.java:[105,52] cannot find symbol
  symbol:   class AppointmentSearchCriteria
  location: class com.example.demo.service.AppointmentService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Noti
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Notification.java:[10,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Noti
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Notification.java:[11,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[21,19] cannot find symbol
  symbol:   class EmailService
  location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[22,19] cannot find symbol
  symbol:   class SMSService
  location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[23,19] cannot find symbol
  symbol:   class PushNotificationService
  location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[145,13] cannot find symbol
  symbol:   class NotificationType
  location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/repository/jpa/N
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/repository/jpa/NotificationRepository.java:[11,67] cannot find symbol
  symbol:   class NotificationType
  location: interface com.example.demo.repository.jpa.NotificationRepository
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Noti
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Notification.java:[6,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Pa
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[8,55] cannot find symbol
  symbol:   class PatientSearchCriteria
  location: class com.example.demo.specification.PatientSpecifications
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Insu
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/InsuranceInfo.java:[8,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Insu
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/InsuranceInfo.java:[9,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Cove
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/CoverageDetails.java:[8,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Cove
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/CoverageDetails.java:[9,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Insu
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/InsuranceInfo.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Cove
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/CoverageDetails.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Medi
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/MedicalRecord.java:[13,36] package javax.validation.constraints does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Clai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Claim.java:[10,2] cannot find symbol
  symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Clai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Claim.java:[11,2] cannot find symbol
  symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Clai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Claim.java:[5,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorSe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorService.java:[7,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorSe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorService.java:[8,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorSe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorService.java:[51,42] cannot find symbol
  symbol:   class DoctorSearchCriteria
  location: class com.example.demo.service.DoctorService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Do
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[5,34] package javax.persistence.criteria does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Do
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[9,54] cannot find symbol
  symbol:   class DoctorSearchCriteria
  location: class com.example.demo.specification.DoctorSpecifications
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Ap
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[5,34] package javax.persistence.criteria does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Ap
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[9,59] cannot find symbol
  symbol:   class AppointmentSearchCriteria
  location: class com.example.demo.specification.AppointmentSpecifications
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalR
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalRecordService.java:[10,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalR
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalRecordService.java:[29,19] cannot find symbol
  symbol:   class SecurityService
  location: class com.example.demo.service.MedicalRecordService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientS
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientService.java:[6,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientS
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientService.java:[7,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientS
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientService.java:[51,44] cannot find symbol
  symbol:   class PatientSearchCriteria
  location: class com.example.demo.service.PatientService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Insuranc
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/InsuranceService.java:[9,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Insuranc
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/InsuranceService.java:[10,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Insuranc
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/InsuranceService.java:[20,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[13,6] cannot find symbol
  symbol:   class Id
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[14,6] cannot find symbol
  symbol:   class GeneratedValue
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[14,32] cannot find symbol
  symbol:   variable GenerationType
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[17,6] cannot find symbol
  symbol:   class ManyToOne
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[17,24] cannot find symbol
  symbol:   variable FetchType
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[18,6] cannot find symbol
  symbol:   class JoinColumn
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[21,6] cannot find symbol
  symbol:   class ManyToOne
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[21,24] cannot find symbol
  symbol:   variable FetchType
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[22,6] cannot find symbol
  symbol:   class JoinColumn
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[25,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[28,6] cannot find symbol
  symbol:   class Enumerated
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[28,17] cannot find symbol
  symbol:   variable EnumType
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[29,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[32,6] cannot find symbol
  symbol:   class Enumerated
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[32,17] cannot find symbol
  symbol:   variable EnumType
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[33,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[11,6] cannot find symbol
  symbol:   class Id
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[12,6] cannot find symbol
  symbol:   class GeneratedValue
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[12,32] cannot find symbol
  symbol:   variable GenerationType
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[15,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[18,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[21,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[24,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[29,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[32,6] cannot find symbol
  symbol:   class ElementCollection
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[33,6] cannot find symbol
  symbol:   class CollectionTable
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[34,24] cannot find symbol
  symbol:   class JoinColumn
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[35,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[38,6] cannot find symbol
  symbol:   class OneToMany
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[38,47] cannot find symbol
  symbol:   variable CascadeType
  location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[12,6] cannot find symbol
  symbol:   class Id
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[13,6] cannot find symbol
  symbol:   class GeneratedValue
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[13,32] cannot find symbol
  symbol:   variable GenerationType
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[16,6] cannot find symbol
  symbol:   class ManyToOne
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[16,24] cannot find symbol
  symbol:   variable FetchType
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[17,6] cannot find symbol
  symbol:   class JoinColumn
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[20,6] cannot find symbol
  symbol:   class Enumerated
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[20,17] cannot find symbol
  symbol:   variable EnumType
  location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[21,6] cannot find symbol
  symbol:   class Column
  location: class com.example.demo.model.mysql.Availability
[INFO] 100 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.759 s
[INFO] Finished at: 2024-12-17T15:44:58-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation fai
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Medi
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/MedicalRecord.java:[53,8] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Medi
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/MedicalRecord.java:[63,8] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Pres
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Prescription.java:[37,8] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDT
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDTO.java:[10,8] class MedicalRecordDTO is public, should be declared in a file named MedicalRecordDTO.java
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDT
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDTO.java:[24,15] modifier static not allowed here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDT
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/dto/AttachmentDTO.java:[32,15] class MetadataDTO is public, should be declared in a file named MetadataDTO.java
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[10,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[11,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Pati
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Patient.java:[9,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Pati
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Patient.java:[10,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[8,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[9,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[9,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[10,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Emer
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/EmergencyContact.java:[7,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Emer
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/EmergencyContact.java:[8,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[6,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[5,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Pati
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Patient.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Emer
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/EmergencyContact.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Appointm
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/AppointmentService.java:[10,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Appointm
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/AppointmentService.java:[11,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[6,38] package com.example.demo.service.email does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[7,36] package com.example.demo.service.sms does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[8,37] package com.example.demo.service.push does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Appointm
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/AppointmentService.java:[105,52] cannot find symbol
[ERROR]   symbol:   class AppointmentSearchCriteria
[ERROR]   location: class com.example.demo.service.AppointmentService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Noti
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Notification.java:[10,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Noti
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Notification.java:[11,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[21,19] cannot find symbol
[ERROR]   symbol:   class EmailService
[ERROR]   location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[22,19] cannot find symbol
[ERROR]   symbol:   class SMSService
[ERROR]   location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[23,19] cannot find symbol
[ERROR]   symbol:   class PushNotificationService
[ERROR]   location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Notifica
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/NotificationService.java:[145,13] cannot find symbol
[ERROR]   symbol:   class NotificationType
[ERROR]   location: class com.example.demo.service.NotificationService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/repository/jpa/N
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/repository/jpa/NotificationRepository.java:[11,67] cannot find symbol
[ERROR]   symbol:   class NotificationType
[ERROR]   location: interface com.example.demo.repository.jpa.NotificationRepository
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Noti
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Notification.java:[6,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Pa
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[8,55] cannot find symbol
[ERROR]   symbol:   class PatientSearchCriteria
[ERROR]   location: class com.example.demo.specification.PatientSpecifications
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Insu
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/InsuranceInfo.java:[8,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Insu
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/InsuranceInfo.java:[9,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Cove
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/CoverageDetails.java:[8,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Cove
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/CoverageDetails.java:[9,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Insu
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/InsuranceInfo.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Cove
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/CoverageDetails.java:[4,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/Medi
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mongo/MedicalRecord.java:[13,36] package javax.validation.constraints does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Clai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Claim.java:[10,2] cannot find symbol
[ERROR]   symbol: class Entity
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Clai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Claim.java:[11,2] cannot find symbol
[ERROR]   symbol: class Table
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Clai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Claim.java:[5,1] package javax.persistence does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorSe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorService.java:[7,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorSe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorService.java:[8,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorSe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/DoctorService.java:[51,42] cannot find symbol
[ERROR]   symbol:   class DoctorSearchCriteria
[ERROR]   location: class com.example.demo.service.DoctorService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Do
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[5,34] package javax.persistence.criteria does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Do
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[9,54] cannot find symbol
[ERROR]   symbol:   class DoctorSearchCriteria
[ERROR]   location: class com.example.demo.specification.DoctorSpecifications
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Ap
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[5,34] package javax.persistence.criteria does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/Ap
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[9,59] cannot find symbol
[ERROR]   symbol:   class AppointmentSearchCriteria
[ERROR]   location: class com.example.demo.specification.AppointmentSpecifications
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalR
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalRecordService.java:[10,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalR
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/MedicalRecordService.java:[29,19] cannot find symbol
[ERROR]   symbol:   class SecurityService
[ERROR]   location: class com.example.demo.service.MedicalRecordService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientS
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientService.java:[6,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientS
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientService.java:[7,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientS
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/PatientService.java:[51,44] cannot find symbol
[ERROR]   symbol:   class PatientSearchCriteria
[ERROR]   location: class com.example.demo.service.PatientService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Insuranc
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/InsuranceService.java:[9,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Insuranc
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/InsuranceService.java:[10,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/Insuranc
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/InsuranceService.java:[20,34] package com.example.demo.exception does not exist
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[13,6] cannot find symbol
[ERROR]   symbol:   class Id
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[14,6] cannot find symbol
[ERROR]   symbol:   class GeneratedValue
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[14,32] cannot find symbol
[ERROR]   symbol:   variable GenerationType
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[17,6] cannot find symbol
[ERROR]   symbol:   class ManyToOne
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[17,24] cannot find symbol
[ERROR]   symbol:   variable FetchType
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[18,6] cannot find symbol
[ERROR]   symbol:   class JoinColumn
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[21,6] cannot find symbol
[ERROR]   symbol:   class ManyToOne
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[21,24] cannot find symbol
[ERROR]   symbol:   variable FetchType
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[22,6] cannot find symbol
[ERROR]   symbol:   class JoinColumn
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[25,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[28,6] cannot find symbol
[ERROR]   symbol:   class Enumerated
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[28,17] cannot find symbol
[ERROR]   symbol:   variable EnumType
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[29,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[32,6] cannot find symbol
[ERROR]   symbol:   class Enumerated
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[32,17] cannot find symbol
[ERROR]   symbol:   variable EnumType
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appo
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Appointment.java:[33,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[11,6] cannot find symbol
[ERROR]   symbol:   class Id
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[12,6] cannot find symbol
[ERROR]   symbol:   class GeneratedValue
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[12,32] cannot find symbol
[ERROR]   symbol:   variable GenerationType
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[15,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[18,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[21,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[24,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[29,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[32,6] cannot find symbol
[ERROR]   symbol:   class ElementCollection
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[33,6] cannot find symbol
[ERROR]   symbol:   class CollectionTable
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[34,24] cannot find symbol
[ERROR]   symbol:   class JoinColumn
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[35,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[38,6] cannot find symbol
[ERROR]   symbol:   class OneToMany
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doct
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Doctor.java:[38,47] cannot find symbol
[ERROR]   symbol:   variable CascadeType
[ERROR]   location: class com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[12,6] cannot find symbol
[ERROR]   symbol:   class Id
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[13,6] cannot find symbol
[ERROR]   symbol:   class GeneratedValue
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[13,32] cannot find symbol
[ERROR]   symbol:   variable GenerationType
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[16,6] cannot find symbol
[ERROR]   symbol:   class ManyToOne
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[16,24] cannot find symbol
[ERROR]   symbol:   variable FetchType
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[17,6] cannot find symbol
[ERROR]   symbol:   class JoinColumn
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[20,6] cannot find symbol
[ERROR]   symbol:   class Enumerated
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[20,17] cannot find symbol
[ERROR]   symbol:   variable EnumType
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Avai
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/model/mysql/Availability.java:[21,6] cannot find symbol
[ERROR]   symbol:   class Column
[ERROR]   location: class com.example.demo.model.mysql.Availability
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException