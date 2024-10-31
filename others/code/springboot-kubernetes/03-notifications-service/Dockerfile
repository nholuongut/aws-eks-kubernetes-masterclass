FROM openjdk:8-jdk-alpine
LABEL maintainer="Nho Luong <luongutnho@hotmail.com>"
VOLUME /tmp
EXPOSE 8096
ADD target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]