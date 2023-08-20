#!/bin/bash

# Wait for MySQL server to be up
/app/wait-for-it.sh mysql-db:3306 -t 0


mvn package

# Start the Spring Boot application
mvn spring-boot:run