FROM maven:3.8.2-amazoncorretto
WORKDIR /app
COPY . 
RUN mvn clean package
ENTRYOINT ["java", "-jar","target/facturas-rest-1.0.0.jar"]
