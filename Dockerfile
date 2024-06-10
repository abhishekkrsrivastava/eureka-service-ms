FROM openjdk:jdk
WORKDIR /appcontainer
EXPOSE 8761
COPY ./target/eureka-service-ms.jar /appcontainer
ADD ./target/eureka-service-ms.jar eureka-service-ms.jar
ENTRYPOINT ["java","-jar","user-service-ms.jar"]