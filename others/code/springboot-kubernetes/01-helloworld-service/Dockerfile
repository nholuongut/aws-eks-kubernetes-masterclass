FROM openjdk:8-jdk-alpine
LABEL maintainer="Nho Luong <luongutnho@hotmail.com>"
LABEL maintainer="Nho Luong <luongutnho@hotmail.com>"
VOLUME /tmp
EXPOSE 8080
ADD target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]