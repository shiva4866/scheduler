FROM maven:3.8.3-openjdk-17

# Copy the src files
COPY . /app

WORKDIR /app

EXPOSE 8080

ENTRYPOINT [ "mvn", "spring-boot:run" ]