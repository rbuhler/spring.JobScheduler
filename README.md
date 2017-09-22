# spring.JobScheduler

# POM

### Build
```
  <build>
    <finalName>${project.artifactId}</finalName>
```
### Dependencies 

````aidl
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
````

# Manifest
```
applications:
- name: JobScheduler
  memory: 512MB
  path: target/jobScheduler.jar
```