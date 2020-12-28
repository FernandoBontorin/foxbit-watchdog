FROM  gradle:jdk15-hotspot AS build

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle sonarqube

RUN gradle bootJar --no-daemon

FROM openjdk:15.0.1-jdk-oraclelinux7

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

RUN chmod +x /app/spring-boot-application.jar

CMD ["java", "-jar", "/app/spring-boot-application.jar"]
