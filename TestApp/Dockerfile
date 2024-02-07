ROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-20-jdk -y
COPY . .



FROM openjdk:20-jdk

EXPOSE 8080

COPY --from=build /build/libs/TestApp-1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]