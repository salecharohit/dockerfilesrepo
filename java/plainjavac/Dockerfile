FROM openjdk:17-alpine
RUN addgroup java && adduser -D -h /home/java -s /bin/ash java -G java
USER java
COPY HelloWorld.java /home/java/HelloWorld.java
WORKDIR /home/java
RUN javac HelloWorld.java
CMD java HelloWorld