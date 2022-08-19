package com.cyrilselyanin.soapclient.service.formulaclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class FormulaClientConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.cyrilselyanin.soapclient.dto.gen");
        return marshaller;
    }

    @Bean
    public FormulaClient formulaClient(Jaxb2Marshaller marshaller) {
        FormulaClient client = new FormulaClient();
        client.setDefaultUri("http://localhost:8080/soap-ws/FormulaService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
