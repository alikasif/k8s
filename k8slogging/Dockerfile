FROM openjdk:21
ARG JAR_FILE=build/libs/\*.jar
COPY ${JAR_FILE} k8slogging-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/k8slogging-1.0-SNAPSHOT.jar"]