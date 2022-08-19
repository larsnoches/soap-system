
package com.cyrilselyanin.soapclient.dto.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cyrilselyanin.soapclient.dto.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EquationRoots_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "equationRoots");
    private final static QName _Discriminant_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "discriminant");
    private final static QName _QuadraticResponse_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "quadraticResponse");
    private final static QName _DiscriminantResponse_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "discriminantResponse");
    private final static QName _EquationRootsResponse_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "equationRootsResponse");
    private final static QName _Calc_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "calc");
    private final static QName _Quadratic_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "quadratic");
    private final static QName _CalcResponse_QNAME = new QName("http://cyrilselyanin.com/service/soap-ws", "calcResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cyrilselyanin.soapclient.dto.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiscriminantResponse }
     * 
     */
    public DiscriminantResponse createDiscriminantResponse() {
        return new DiscriminantResponse();
    }

    /**
     * Create an instance of {@link QuadraticResponse }
     * 
     */
    public QuadraticResponse createQuadraticResponse() {
        return new QuadraticResponse();
    }

    /**
     * Create an instance of {@link EquationRoots }
     * 
     */
    public EquationRoots createEquationRoots() {
        return new EquationRoots();
    }

    /**
     * Create an instance of {@link Discriminant }
     * 
     */
    public Discriminant createDiscriminant() {
        return new Discriminant();
    }

    /**
     * Create an instance of {@link CalcResponse }
     * 
     */
    public CalcResponse createCalcResponse() {
        return new CalcResponse();
    }

    /**
     * Create an instance of {@link Calc }
     * 
     */
    public Calc createCalc() {
        return new Calc();
    }

    /**
     * Create an instance of {@link Quadratic }
     * 
     */
    public Quadratic createQuadratic() {
        return new Quadratic();
    }

    /**
     * Create an instance of {@link EquationRootsResponse }
     * 
     */
    public EquationRootsResponse createEquationRootsResponse() {
        return new EquationRootsResponse();
    }

    /**
     * Create an instance of {@link CalcSolution }
     * 
     */
    public CalcSolution createCalcSolution() {
        return new CalcSolution();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquationRoots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "equationRoots")
    public JAXBElement<EquationRoots> createEquationRoots(EquationRoots value) {
        return new JAXBElement<EquationRoots>(_EquationRoots_QNAME, EquationRoots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Discriminant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "discriminant")
    public JAXBElement<Discriminant> createDiscriminant(Discriminant value) {
        return new JAXBElement<Discriminant>(_Discriminant_QNAME, Discriminant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuadraticResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "quadraticResponse")
    public JAXBElement<QuadraticResponse> createQuadraticResponse(QuadraticResponse value) {
        return new JAXBElement<QuadraticResponse>(_QuadraticResponse_QNAME, QuadraticResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscriminantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "discriminantResponse")
    public JAXBElement<DiscriminantResponse> createDiscriminantResponse(DiscriminantResponse value) {
        return new JAXBElement<DiscriminantResponse>(_DiscriminantResponse_QNAME, DiscriminantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquationRootsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "equationRootsResponse")
    public JAXBElement<EquationRootsResponse> createEquationRootsResponse(EquationRootsResponse value) {
        return new JAXBElement<EquationRootsResponse>(_EquationRootsResponse_QNAME, EquationRootsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "calc")
    public JAXBElement<Calc> createCalc(Calc value) {
        return new JAXBElement<Calc>(_Calc_QNAME, Calc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quadratic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "quadratic")
    public JAXBElement<Quadratic> createQuadratic(Quadratic value) {
        return new JAXBElement<Quadratic>(_Quadratic_QNAME, Quadratic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cyrilselyanin.com/service/soap-ws", name = "calcResponse")
    public JAXBElement<CalcResponse> createCalcResponse(CalcResponse value) {
        return new JAXBElement<CalcResponse>(_CalcResponse_QNAME, CalcResponse.class, null, value);
    }

}
