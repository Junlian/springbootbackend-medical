[INFO] 30 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  19.486 s
[INFO] Finished at: 2024-12-17T18:56:18-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/MedicalRecordAttachmentController.java:[35,53] cannot find symbol
[ERROR]   symbol:   method uploadAttachment(java.lang.Long,java.lang.String,org.springframework.web.multipart.MultipartFile)
[ERROR]   location: variable attachmentService of type com.example.demo.service.MedicalRecordAttachmentService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/MedicalRecordAttachmentController.java:[44,46] cannot find symbol
[ERROR]   symbol:   method downloadAttachment(java.lang.Long,java.lang.String,java.lang.String)      
[ERROR]   location: variable attachmentService of type com.example.demo.service.MedicalRecordAttachmentService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/InsuranceController.java:[24,50] method verifyInsurance in interface com.example.demo.service.InsuranceService cannot be applied to given types;
[ERROR]   required: java.lang.String
[ERROR]   found:    java.lang.String,java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/InsuranceController.java:[29,50] cannot find symbol
[ERROR]   symbol:   method getPatientCoverage(java.lang.Long)
[ERROR]   location: variable insuranceService of type com.example.demo.service.InsuranceService      
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/InsuranceController.java:[34,63] incompatible types: @jakarta.validation.Valid com.example.demo.dto.ClaimDTO cannot be converted to com.example.demo.model.mysql.Claim
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/InsuranceController.java:[39,50] cannot find symbol
[ERROR]   symbol:   method getClaimStatus(java.lang.Long)
[ERROR]   location: variable insuranceService of type com.example.demo.service.InsuranceService      
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/InsuranceController.java:[47,50] cannot find symbol
[ERROR]   symbol:   method getPatientClaims(java.lang.Long,int,int)
[ERROR]   location: variable insuranceService of type com.example.demo.service.InsuranceService      
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorController.java:[22,61] incompatible types: @jakarta.validation.Valid com.example.demo.dto.DoctorDTO cannot be converted to com.example.demo.model.mysql.Doctor[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorController.java:[30,47] cannot find symbol
[ERROR]   symbol:   method getAllDoctors(int,int,java.lang.String)
[ERROR]   location: variable doctorService of type com.example.demo.service.DoctorService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorController.java:[35,47] cannot find symbol
[ERROR]   symbol:   method getDoctorById(java.lang.Long)
[ERROR]   location: variable doctorService of type com.example.demo.service.DoctorService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorController.java:[42,47] cannot find symbol
[ERROR]   symbol:   method updateDoctor(java.lang.Long,@jakarta.validation.Valid com.example.demo.dto.DoctorDTO)
[ERROR]   location: variable doctorService of type com.example.demo.service.DoctorService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorController.java:[47,22] cannot find symbol
[ERROR]   symbol:   method deleteDoctor(java.lang.Long)
[ERROR]   location: variable doctorService of type com.example.demo.service.DoctorService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorController.java:[55,47] cannot find symbol
[ERROR]   symbol:   method getDoctorAvailability(java.lang.Long,java.lang.String)
[ERROR]   location: variable doctorService of type com.example.demo.service.DoctorService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/MedicalRecordController.java:[23,54] cannot find symbol
[ERROR]   symbol:   method getPatientMedicalRecords(java.lang.Long,int,int)
[ERROR]   location: variable medicalRecordService of type com.example.demo.service.MedicalRecordService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/MedicalRecordController.java:[30,54] method createMedicalRecord 
in interface com.example.demo.service.MedicalRecordService cannot be applied to given types;
[ERROR]   required: com.example.demo.model.mongo.MedicalRecord
[ERROR]   found:    java.lang.Long,@jakarta.validation.Valid com.example.demo.dto.MedicalRecordDTO   
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/MedicalRecordController.java:[37,54] method getMedicalRecord in 
interface com.example.demo.service.MedicalRecordService cannot be applied to given types;
[ERROR]   required: java.lang.String
[ERROR]   found:    java.lang.Long,java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/MedicalRecordController.java:[45,54] method updateMedicalRecord 
in interface com.example.demo.service.MedicalRecordService cannot be applied to given types;
[ERROR]   required: java.lang.String,com.example.demo.model.mongo.MedicalRecord
[ERROR]   found:    java.lang.Long,java.lang.String,@jakarta.validation.Valid com.example.demo.dto.MedicalRecordDTO
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/NotificationController.java:[19,46] incompatible types: @jakarta.validation.Valid com.example.demo.dto.NotificationDTO cannot be converted to com.example.demo.model.mysql.Notification
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/NotificationController.java:[25,53] cannot find symbol
[ERROR]   symbol:   method getNotificationStatus(java.lang.Long)
[ERROR]   location: variable notificationService of type com.example.demo.service.NotificationService[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/NotificationController.java:[30,28] cannot find symbol
[ERROR]   symbol:   method resendNotification(java.lang.Long)
[ERROR]   location: variable notificationService of type com.example.demo.service.NotificationService[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/AppointmentController.java:[20,71] incompatible types: @jakarta.validation.Valid com.example.demo.dto.AppointmentDTO cannot be converted to com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/AppointmentController.java:[32,52] cannot find symbol
[ERROR]   symbol:   method getAppointments(java.lang.Long,java.lang.Long,java.lang.String,java.lang.String,java.lang.String,int,int)
[ERROR]   location: variable appointmentService of type com.example.demo.service.AppointmentService  
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/AppointmentController.java:[38,52] cannot find symbol
[ERROR]   symbol:   method getAppointmentById(java.lang.Long)
[ERROR]   location: variable appointmentService of type com.example.demo.service.AppointmentService  
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/AppointmentController.java:[45,33] incompatible types: inference variable T has incompatible bounds
[ERROR]     equality constraints: com.example.demo.dto.AppointmentDTO
[ERROR]     lower bounds: com.example.demo.model.mysql.Appointment
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorAvailabilityController.java:[24,53] cannot find symbol    
[ERROR]   symbol:   method getDoctorAvailability(java.lang.Long,java.time.LocalDate)
[ERROR]   location: variable availabilityService of type com.example.demo.service.DoctorAvailabilityService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorAvailabilityController.java:[31,53] cannot find symbol    
[ERROR]   symbol:   method addAvailability(java.lang.Long,@jakarta.validation.Valid com.example.demo.dto.AvailabilityDTO)
[ERROR]   location: variable availabilityService of type com.example.demo.service.DoctorAvailabilityService
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorAvailabilityController.java:[39,53] method updateAvailability in interface com.example.demo.service.DoctorAvailabilityService cannot be applied to given types;[ERROR]   required: com.example.demo.model.mysql.Doctor,boolean
[ERROR]   found:    java.lang.Long,java.lang.Long,@jakarta.validation.Valid com.example.demo.dto.AvailabilityDTO
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/controller/DoctorAvailabilityController.java:[46,28] cannot find symbol
[ERROR]   symbol:   method deleteAvailability(java.lang.Long,java.lang.Long)
[ERROR]   location: variable availabilityService of type com.example.demo.service.DoctorAvailabilityService     
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/target/generated-sources/annotations/com/example/demo/mapper/MedicalRecordMapperImpl.java:[40,94] incompatible types: java.util.List<com.example.demo.model.mongo.Attachment> cannot be converted to java.util.List<com.example.demo.model.Attachment>
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/target/generated-sources/annotations/com/example/demo/mapper/MedicalRecordMapperImpl.java:[67,62] incompatible types: java.util.List<com.example.demo.model.Attachment> cannot be converted to java.util.List<com.example.demo.model.mongo.Attachment>
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:       
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
PS D:\laizi360xiazai\project-bolt-sb1-sdmzvcekHealthCareManagement\demospringboot002\demo>

