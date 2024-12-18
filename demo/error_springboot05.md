[INFO] 12 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  15.426 s
[INFO] Finished at: 2024-12-17T18:51:43-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMapper.java:[14,12] Can't map property "LocalTime availability[].startTime" to "LocalDateTime availability[].startTime". Consider to declare/implement a mapping method: "LocalDateTime map(LocalTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMapper.java:[14,12] Can't map property "LocalTime availability[].endTime" to "LocalDateTime availability[].endTime". Consider to declare/implement a mapping method: "LocalDateTime map(LocalTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMapper.java:[15,21] Can't map property "LocalDateTime startTime" to "LocalTime startTime". Consider to declare/implement a mapping method: "LocalTime map(LocalDateTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/DoctorMapper.java:[15,21] Can't map property "LocalDateTime endTime" to "LocalTime endTime". Consider to declare/implement a mapping method: "LocalTime map(LocalDateTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[10,22] Can't map property "List<Attachment> attachments" to "List<String> attachments". Consider to declare/implement a mapping method: "List<String> map(List<Attachment> value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/MedicalRecordMapper.java:[11,19] Can't map property "List<String> attachments" to "List<Attachment> attachments". Consider to declare/implement a mapping method: "List<Attachment> map(List<String> value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/AvailabilityMapper.java:[15,21] Can't map property "LocalDateTime startTime" to "LocalTime startTime". Consider to declare/implement a mapping method: "LocalTime map(LocalDateTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/AvailabilityMapper.java:[15,21] Can't map property "LocalDateTime endTime" to "LocalTime endTime". Consider to declare/implement a mapping method: "LocalTime map(LocalDateTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/AvailabilityMapper.java:[18,18] Can't map property "LocalTime startTime" to "LocalDateTime startTime". Consider to declare/implement a mapping method: "LocalDateTime map(LocalTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/AvailabilityMapper.java:[18,18] Can't map property "LocalTime endTime" to "LocalDateTime endTime". Consider to declare/implement a mapping method: "LocalDateTime map(LocalTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/AvailabilityMapper.java:[21,10] Can't map property "LocalTime startTime" to "LocalDateTime startTime". Consider to declare/implement a mapping method: "LocalDateTime map(LocalTime value)".
[ERROR] /D:/laizi360xiazai/project-bolt-sb1-sdmzvcekHealthCareManagement/demospringboot002/demo/src/main/java/com/example/demo/mapper/AvailabilityMapper.java:[21,10] Can't map property "LocalTime endTime" to "LocalDateTime endTime". Consider to declare/implement a mapping method: "LocalDateTime map(LocalTime value)".
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
PS D:\laizi360xiazai\project-bolt-sb1-sdmzvcekHealthCareManagement\demospringboot002\demo> 