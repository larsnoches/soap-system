FROM bellsoft/liberica-openjdk-alpine:8
COPY /target/soapclient-*.jar soapclient.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "soapclient.jar"]