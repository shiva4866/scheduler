FROM maven:3.8.3-openjdk-17

COPY . /app
WORKDIR /app

RUN mvn package

RUN ls -la

ENTRYPOINT [ "mvn", "spring-boot:run" ]