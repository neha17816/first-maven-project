FROM openjdk:11
EXPOSE 8080
ADD target/first-maven-project-service.jar first-maven-project-service.jar 
ENTRYPOINT ["java","-jar","/first-maven-project-service.jar"]