
package com.cyrilselyanin.soapclient.dto.gen;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FormulaService", targetNamespace = "http://cyrilselyanin.com/service/soap-ws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FormulaService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Double>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "equationRoots", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.EquationRoots")
    @ResponseWrapper(localName = "equationRootsResponse", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.EquationRootsResponse")
    public List<Double> equationRoots(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Double arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        Double arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "discriminant", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.Discriminant")
    @ResponseWrapper(localName = "discriminantResponse", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.DiscriminantResponse")
    public Double discriminant(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Double arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Double>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calc", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.Calc")
    @ResponseWrapper(localName = "calcResponse", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.CalcResponse")
    public List<Double> calc(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quadratic", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.Quadratic")
    @ResponseWrapper(localName = "quadraticResponse", targetNamespace = "http://cyrilselyanin.com/service/soap-ws", className = "com.cyrilselyanin.soapclient.dto.gen.QuadraticResponse")
    public String quadratic(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Double arg2);

}
