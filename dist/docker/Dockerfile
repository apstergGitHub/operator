FROM openjdk

WORKDIR /app
COPY operator-app/build/libs/operator-app.jar operator.jar
CMD ["java", "-jar", "operator.jar"]