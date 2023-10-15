FROM openjdk:17-jdk-alpine
MAINTAINER haanido
COPY target/loten-backend-0.0.3-SNAPSHOT.jar loten-backend-0.0.3-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/loten-backend-0.0.3-SNAPSHOT.jar"]
EXPOSE 8888