FROM jboss/wildfly:25.0.0.Final

ADD ./target/soapws-1.0.war /opt/jboss/wildfly/standalone/deployments/

USER root
RUN chown jboss:jboss /opt/jboss/wildfly/standalone/deployments/soapws-1.0.war
USER jboss

RUN mkdir /opt/jboss/wildfly/standalone/log