FROM openjdk:17-alpine
COPY target/student-aplication.jar student.jar
ENTRYPOINT["java","-jar","/student.jar"]