FROM openjdk:17-jdk-alpine
ARG JAR_FILE
COPY ${JAR_FILE} multibranch.jar
ENTRYPOINT  ["java","-jar","/multibranch.jar"]
