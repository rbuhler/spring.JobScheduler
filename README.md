# spring.JobScheduler

## API endpoint
- https://api.cf.eu10.hana.ondemand.com
```
$ cf push jobScheduler
```

## Dependencies 

````aidl
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
````
````aidl
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
````
## Persistency
* Entity
* Repository

## Service
* ReceiveRecord

## Controller
* RecordController

## Models
* 

## Stubs
* 

# POM
```
  <build>
    <finalName>${project.artifactId}</finalName>
    ...
```
# Manifest
