FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8086
ADD target/springboot-docker-demo.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "/springboot-docker-demo.jar"]
