FROM bellsoft/liberica-openjdk-alpine:8
COPY target/soapclient-*.jar soapclient.jar
ENTRYPOINT ["java"]
CMD ["-jar", "soapclient.jar"]