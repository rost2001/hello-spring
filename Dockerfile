FROM openjdk:11

EXPOSE 8080

ARG JAR_FILE=target/*.jar

WORKDIR /hello

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]