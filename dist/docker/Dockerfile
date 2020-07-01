FROM openjdk

WORKDIR /app
COPY operator-app/build/libs/operator-fat.jar operator.jar
CMD ["java", "-jar", "operator.jar"]