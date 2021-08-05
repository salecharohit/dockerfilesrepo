FROM maven:3.8.1-openjdk-11-slim AS MAVEN_BUILD
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/
COPY WebContent /build/WebContent
RUN mvn package

FROM tomcat:9.0-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/ROOT
RUN addgroup tomcat && adduser -D -s /bin/ash tomcat -G tomcat
# Running Tomcat on Port 8090 L69 server.xml
COPY server.xml /usr/local/tomcat/conf
RUN chown -R tomcat:tomcat /usr/local/tomcat
USER tomcat
COPY --from=MAVEN_BUILD /build/target/struts2maven.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8090
CMD ["catalina.sh", "run"]