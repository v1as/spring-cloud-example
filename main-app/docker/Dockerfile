FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY main-app.jar main-app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/main-app.jar"]