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
[INFO] Compiling 88 source files with javac [debug release 21] to target\classes
[INFO] Annotation processing is enabled because one or more processors were found
  on the class path. A future release of javac may disable annotation processing 
  unless at least one processor is specified by name (-processor), or a search   
  path is specified (--processor-path, --processor-module-path), or annotation   
  processing is enabled explicitly (-proc:only, -proc:full).
  Use -Xlint:-options to suppress this message.
  Use -proc:none to disable annotation processing.
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/Medical
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[12,22] Unmapped target properties: "prescriptions, treatments, followUpInstructions".
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/Patient
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/PatientMapper.java:[12,13] Unmapped target property: "patient". Mapping from Collection element "EmergencyContactDTO emergencyContacts" to "EmergencyC
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/PatientMapper.java:[12,13] Unmapped target property: "patient". Mapping from Collection element "EmergencyContactDTO emergencyContacts" to "EmergencyContact emergencyContacts".
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/Patient
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/PatientMapper.java:[13,10] Unmapped target property: "patient". Mapping from Collection element "EmergencyContactDTO emergencyContacts" to "EmergencyC
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/PatientMapper.java:[13,10] Unmapped target property: "patient". Mapping from Collection element "EmergencyContactDTO emergencyContacts" to "EmergencyContact emergencyContacts".
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/Insuran
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/InsuranceMapper.java:[16,19] Unmapped target property: "insuranceInfo". Mapping from property "CoverageDetailsDTO coverage" to "CoverageDetails covera
[WARNING] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/InsuranceMapper.java:[16,19] Unmapped target property: "insuranceInfo". Mapping from property "CoverageDetailsDTO coverage" to "CoverageDetails coverage".
[INFO] 4 warnings
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMap
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMapper.java:[16,10] Can't generate mapping method from iterable type from java stdlib to non-iterable type.
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[12,22] Can't map property "List<MedicalRecord.Attachment> attachments" to "List<String> attachments". Consider to declare/impl
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[12,22] Can't map property "List<MedicalRecord.Attachment> attachments" to "List<String> attachments". Consider to declare/implement a mapping method: "List<String> map(List<MedicalRecord.Attachment> value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[13,19] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/impl
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[13,19] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/implement a mapping method: "List<MedicalRecord.Attachment> map(List<String> value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[14,10] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/impl
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[14,10] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/implement a mapping method: "List<MedicalRecord.Attachment> map(List<String> value)".
[INFO] 4 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  15.325 s
[INFO] Finished at: 2024-12-17T16:19:56-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation fai
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMap
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMapper.java:[16,10] Can't generate mapping method from iterable type from java stdlib to non-iterable type.
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[12,22] Can't map property "List<MedicalRecord.Attachment> attachments" to "List<String> attachments". Consider to declare/impl
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[12,22] Can't map property "List<MedicalRecord.Attachment> attachments" to "List<String> attachments". Consider to declare/implement a mapping method: "List<String> map(List<MedicalRecord.Attachment> value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[13,19] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/impl
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[13,19] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/implement a mapping method: "List<MedicalRecord.Attachment> map(List<String> value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRe
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[14,10] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/impl
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[14,10] Can't map property "List<String> attachments" to "List<MedicalRecord.Attachment> attachments". Consider to declare/implement a mapping method: "List<MedicalRecord.Attachment> map(List<String> value)".
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException