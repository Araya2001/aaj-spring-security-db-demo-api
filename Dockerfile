FROM gradle:jdk17 AS build-env
WORKDIR /app
COPY build.gradle ./
COPY src ./src
RUN gradle bootJar
FROM openjdk:17-alpine
COPY --from=build-env /app/build/libs/*.jar /app.jar
ENV PORT 8080
CMD ["java","-jar","-Dspring.profiles.active=docker-compose","/app.jar"]