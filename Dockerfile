# Use a base image with Java and Maven pre-installed
FROM maven:3.8.4-openjdk-11-slim

# Set the working directory inside the container
WORKDIR /sample

# Copy the pom.xml file to the working directory
COPY pom.xml /sample

# Download the project dependencies
RUN mvn dependency:go-offline -B

# Copy the source code to the working directory
COPY src sample/src

# Build the project
RUN mvn clean package

# Set the entry point to run the tests
ENTRYPOINT ["mvn", "clean", "test"]
