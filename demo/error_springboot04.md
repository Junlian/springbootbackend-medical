[INFO] 78 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.412 s
[INFO] Finished at: 2024-12-17T18:39:55-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/email/EmailServiceImpl.java:[6,42] interface expected here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/sms/SMSServiceImpl.java:[6,40] interface expected here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/push/PushNotificationServiceImpl.java:[6,53] interface expected here
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[35,22] cannot find symbol      
[ERROR]   symbol:   method setPatientId(java.lang.Long)
[ERROR]   location: variable medicalRecord of type com.example.demo.model.mongo.MedicalRecord        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[36,22] cannot find symbol      
[ERROR]   symbol:   method setCreatedAt(java.time.LocalDateTime)
[ERROR]   location: variable medicalRecord of type com.example.demo.model.mongo.MedicalRecord        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[37,22] cannot find symbol      
[ERROR]   symbol:   method setUpdatedAt(java.time.LocalDateTime)
[ERROR]   location: variable medicalRecord of type com.example.demo.model.mongo.MedicalRecord        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[45,76] incompatible types: java.util.Optional<com.example.demo.model.mongo.MedicalRecord> cannot be converted to com.example.demo.model.mongo.MedicalRecord
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[68,84] incompatible types: java.util.Optional<com.example.demo.model.mongo.MedicalRecord> cannot be converted to com.example.demo.model.mongo.MedicalRecord
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[74,22] cannot find symbol      
[ERROR]   symbol:   method setId(java.lang.String)
[ERROR]   location: variable updatedRecord of type com.example.demo.model.mongo.MedicalRecord        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[75,22] cannot find symbol      
[ERROR]   symbol:   method setPatientId(java.lang.Long)
[ERROR]   location: variable updatedRecord of type com.example.demo.model.mongo.MedicalRecord        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[76,50] cannot find symbol      
[ERROR]   symbol:   method getCreatedAt()
[ERROR]   location: variable existingRecord of type com.example.demo.model.mongo.MedicalRecord       
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordServiceImpl.java:[77,22] cannot find symbol      
[ERROR]   symbol:   method setUpdatedAt(java.time.LocalDateTime)
[ERROR]   location: variable updatedRecord of type com.example.demo.model.mongo.MedicalRecord        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/PatientServiceImpl.java:[55,16] cannot find symbol
[ERROR]   symbol:   method setId(java.lang.Long)
[ERROR]   location: variable patient of type com.example.demo.model.mysql.Patient
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/email/EmailServiceImpl.java:[8,5] method does not override or implement a method from a supertype
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[15,25] cannot find symbol        
[ERROR]   symbol:   method getName()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[16,82] cannot find symbol        
[ERROR]   symbol:   method getName()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[19,25] cannot find symbol        
[ERROR]   symbol:   method getEmail()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[20,68] cannot find symbol        
[ERROR]   symbol:   method getEmail()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[23,25] cannot find symbol        
[ERROR]   symbol:   method getPhone()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[24,68] cannot find symbol        
[ERROR]   symbol:   method getPhone()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[27,25] cannot find symbol        
[ERROR]   symbol:   method getInsuranceNumber()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/PatientSpecifications.java:[28,78] cannot find symbol        
[ERROR]   symbol:   method getInsuranceNumber()
[ERROR]   location: variable criteria of type com.example.demo.criteria.PatientSearchCriteria        
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/InsuranceServiceImpl.java:[40,24] cannot find symbol
[ERROR]   symbol:   method setPolicyNumber(java.lang.String)
[ERROR]   location: variable verificationDTO of type com.example.demo.dto.InsuranceVerificationDTO   
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/InsuranceServiceImpl.java:[41,24] cannot find symbol
[ERROR]   symbol:   method setProvider(java.lang.String)
[ERROR]   location: variable verificationDTO of type com.example.demo.dto.InsuranceVerificationDTO   
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/InsuranceServiceImpl.java:[42,24] cannot find symbol
[ERROR]   symbol:   method setVerified(boolean)
[ERROR]   location: variable verificationDTO of type com.example.demo.dto.InsuranceVerificationDTO   
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/InsuranceServiceImpl.java:[58,14] cannot find symbol
[ERROR]   symbol:   method setSubmissionDate(java.time.LocalDateTime)
[ERROR]   location: variable claim of type com.example.demo.model.mysql.Claim
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/InsuranceServiceImpl.java:[59,14] cannot find symbol
[ERROR]   symbol:   method setStatus(java.lang.String)
[ERROR]   location: variable claim of type com.example.demo.model.mysql.Claim
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/DoctorServiceImpl.java:[59,56] cannot find symbol
[ERROR]   symbol:   method getAvailability()
[ERROR]   location: variable doctor of type com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/DoctorServiceImpl.java:[70,15] cannot find symbol
[ERROR]   symbol:   method setId(java.lang.Long)
[ERROR]   location: variable doctor of type com.example.demo.model.mysql.Doctor
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/sms/SMSServiceImpl.java:[8,5] method does not override or implement a method from a supertype
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[33,21] cannot find symbol       
[ERROR]   symbol:   method setSentAt(java.time.LocalDateTime)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[37,25] cannot find symbol       
[ERROR]   symbol:   method setStatus(java.lang.String)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[38,25] cannot find symbol       
[ERROR]   symbol:   method setDeliveredAt(java.time.LocalDateTime)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[40,25] cannot find symbol       
[ERROR]   symbol:   method setStatus(java.lang.String)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[58,21] cannot find symbol       
[ERROR]   symbol:   method setSentAt(java.time.LocalDateTime)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[59,21] cannot find symbol       
[ERROR]   symbol:   method setStatus(java.lang.String)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[60,21] cannot find symbol       
[ERROR]   symbol:   method setDeliveredAt(<nulltype>)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[64,25] cannot find symbol       
[ERROR]   symbol:   method setStatus(java.lang.String)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[65,25] cannot find symbol       
[ERROR]   symbol:   method setDeliveredAt(java.time.LocalDateTime)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[67,25] cannot find symbol       
[ERROR]   symbol:   method setStatus(java.lang.String)
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[74,29] cannot find symbol       
[ERROR]   symbol:   method getChannel()
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[77,33] cannot find symbol       
[ERROR]   symbol:   method getRecipientId()
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[79,33] cannot find symbol       
[ERROR]   symbol:   method getMessage()
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[84,33] cannot find symbol       
[ERROR]   symbol:   method getRecipientId()
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[85,33] cannot find symbol       
[ERROR]   symbol:   method getMessage()
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/NotificationServiceImpl.java:[89,103] cannot find symbol      
[ERROR]   symbol:   method getChannel()
[ERROR]   location: variable notification of type com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/DoctorAvailabilityServiceImpl.java:[47,21] cannot find symbol 
[ERROR]   symbol:   method setDoctor(com.example.demo.model.mysql.Doctor)
[ERROR]   location: variable availability of type com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/DoctorAvailabilityServiceImpl.java:[48,21] cannot find symbol 
[ERROR]   symbol:   method setIsAvailable(boolean)
[ERROR]   location: variable availability of type com.example.demo.model.mysql.Availability
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordAttachmentServiceImpl.java:[36,22] cannot find symbol
[ERROR]   symbol:   method setFileId(java.lang.String)
[ERROR]   location: variable attachmentDTO of type com.example.demo.dto.AttachmentDTO
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordAttachmentServiceImpl.java:[37,22] cannot find symbol
[ERROR]   symbol:   method setFileName(java.lang.String)
[ERROR]   location: variable attachmentDTO of type com.example.demo.dto.AttachmentDTO
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordAttachmentServiceImpl.java:[38,22] cannot find symbol
[ERROR]   symbol:   method setFileType(java.lang.String)
[ERROR]   location: variable attachmentDTO of type com.example.demo.dto.AttachmentDTO
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordAttachmentServiceImpl.java:[39,22] cannot find symbol
[ERROR]   symbol:   method setUploadDate(java.time.LocalDateTime)
[ERROR]   location: variable attachmentDTO of type com.example.demo.dto.AttachmentDTO
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordAttachmentServiceImpl.java:[41,15] cannot find symbol
[ERROR]   symbol:   method getAttachments()
[ERROR]   location: variable record of type com.example.demo.model.mongo.MedicalRecord
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/MedicalRecordAttachmentServiceImpl.java:[53,20] cannot find symbol
[ERROR]   symbol:   method getAttachments()
[ERROR]   location: variable record of type com.example.demo.model.mongo.MedicalRecord
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/push/PushNotificationServiceImpl.java:[8,5] method does not override or implement a method from a supertype
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/AppointmentServiceImpl.java:[36,65] cannot find symbol        
[ERROR]   symbol:   method getDoctorId()
[ERROR]   location: variable appointmentDTO of type com.example.demo.dto.AppointmentDTO
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/AppointmentServiceImpl.java:[39,68] cannot find symbol        
[ERROR]   symbol:   method getPatientId()
[ERROR]   location: variable appointmentDTO of type com.example.demo.dto.AppointmentDTO
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/AppointmentServiceImpl.java:[43,20] cannot find symbol        
[ERROR]   symbol:   method setDoctor(com.example.demo.model.mysql.Doctor)
[ERROR]   location: variable appointment of type com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/AppointmentServiceImpl.java:[44,20] cannot find symbol        
[ERROR]   symbol:   method setPatient(com.example.demo.model.mysql.Patient)
[ERROR]   location: variable appointment of type com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/service/impl/AppointmentServiceImpl.java:[76,20] cannot find symbol        
[ERROR]   symbol:   method setStatus(java.lang.String)
[ERROR]   location: variable appointment of type com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[15,25] cannot find symbol
[ERROR]   symbol:   method getName()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[16,82] cannot find symbol
[ERROR]   symbol:   method getName()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[19,25] cannot find symbol
[ERROR]   symbol:   method getSpecialization()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[20,77] cannot find symbol
[ERROR]   symbol:   method getSpecialization()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[23,25] cannot find symbol
[ERROR]   symbol:   method getCity()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[24,72] cannot find symbol
[ERROR]   symbol:   method getCity()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[27,25] cannot find symbol
[ERROR]   symbol:   method getIsAvailable()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/DoctorSpecifications.java:[28,74] cannot find symbol
[ERROR]   symbol:   method getIsAvailable()
[ERROR]   location: variable criteria of type com.example.demo.criteria.DoctorSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[17,25] cannot find symbol    
[ERROR]   symbol:   method getPatientId()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[19,69] cannot find symbol    
[ERROR]   symbol:   method getPatientId()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[23,25] cannot find symbol    
[ERROR]   symbol:   method getDoctorId()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[25,68] cannot find symbol    
[ERROR]   symbol:   method getDoctorId()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[29,25] cannot find symbol    
[ERROR]   symbol:   method getStartDate()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[29,60] cannot find symbol    
[ERROR]   symbol:   method getEndDate()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[32,33] cannot find symbol    
[ERROR]   symbol:   method getStartDate()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[33,33] cannot find symbol    
[ERROR]   symbol:   method getEndDate()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[37,25] cannot find symbol    
[ERROR]   symbol:   method getStatus()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/specification/AppointmentSpecifications.java:[39,58] cannot find symbol    
[ERROR]   symbol:   method getStatus()
[ERROR]   location: variable criteria of type com.example.demo.dto.AppointmentSearchCriteria
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
PS D:\laizi360xiazai\project-bolt-sb1-sdmzvcekHealthCareManagement\demospringboot002\demo> 