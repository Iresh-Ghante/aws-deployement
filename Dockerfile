# Use a slim base image with Java 17
FROM amazoncorretto:17-alpine-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the target directory to the container
COPY target/aws-demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# The command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
