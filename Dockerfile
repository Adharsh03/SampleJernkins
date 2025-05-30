FROM eclipse-temurin:17
COPY target/jern.jar jern.jar
CMD [ "java","-jar","jern.jar" ]