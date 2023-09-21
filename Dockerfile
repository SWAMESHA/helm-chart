FROM openjdk:8
ADD target/helm-chart-0.0.1-SNAPSHOT.jar helm-chart-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/helm-chart-0.0.1-SNAPSHOT.jar"]