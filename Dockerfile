FROM openjdk:11-jre-slim-buster
COPY target/calc-api-0.0.1-SNAPSHOT.jar calc-api-1.0.0.jar
ENTRYPOINT ["java","-jar","/calc-api-1.0.0.jar"]
