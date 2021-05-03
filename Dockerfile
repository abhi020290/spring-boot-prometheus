FROM openjdk:8-jdk-alpine
EXPOSE 8080
ENV CC_APP_HOME /usr/src/app
ARG JAR_FILE=/target/spring-boot-prometheus-*.jar
COPY $JAR_FILE $CC_APP_HOME/spring-boot-prometheus.jar
WORKDIR $CC_APP_HOME
ENTRYPOINT ["java" , "-jar" , "spring-boot-prometheus.jar"]