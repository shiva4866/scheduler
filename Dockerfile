FROM maven:3.8.3-openjdk-17

# Copy the src files
COPY . /app

# Use wait-for-it, to have the mysql server up, before building ..
ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh /app/wait-for-it.sh
RUN chmod +x /app/wait-for-it.sh

WORKDIR /app

EXPOSE 8080

# Run the application
CMD ["/bin/bash", "/app/start-app.sh"]