package com.cyrilselyanin.soapclient.service.formulaclient;

import com.cyrilselyanin.soapclient.dto.gen.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

/**
 * SOAP-клиент
 */
public class FormulaClient extends WebServiceGatewaySupport {
    private static final Logger logger = LoggerFactory.getLogger(FormulaClient.class);

    public CalcResponse calcSolution(Integer a, Integer b, Integer c) {
        Calc request = new Calc();
        request.setArg0(a);
        request.setArg1(b);
        request.setArg2(c);

        logger.info("Requesting information for calcSolution");

        JAXBElement<CalcResponse> calcResponseJAXBElement =
                (JAXBElement<CalcResponse>) getWebServiceTemplate()
                        .marshalSendAndReceive(
                                new ObjectFactory().createCalc(request)
                        );
        return calcResponseJAXBElement.getValue();
    }
}
