#FROM java:8
FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD eureka.jar app.jar
#RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]