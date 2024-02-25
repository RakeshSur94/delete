FROM openjdk:17-alpine
COPY target/student.jar student.jar
ENTRYPOINT ["java","-jar","/student.jar"]