FROM maven:3.8.3-openjdk-17

COPY . /app
WORKDIR /app

RUN mvn package

ENTRYPOINT [ "mvn", "springboot:run" ]