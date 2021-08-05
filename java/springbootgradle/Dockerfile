FROM gradle:jdk16 AS GRADLE_BUILD
WORKDIR /gradle/
COPY build.gradle settings.gradle /gradle/
COPY src /gradle/src/
RUN gradle build

FROM openjdk:17-alpine
RUN addgroup boot && adduser -D -h /home/boot -s /bin/ash boot -G boot
USER boot
WORKDIR /home/boot
COPY --from=GRADLE_BUILD /gradle/build/libs/springbootgradle.jar /home/boot/springbootgradle.jar
EXPOSE 8080
CMD java -jar /home/boot/springbootgradle.jar