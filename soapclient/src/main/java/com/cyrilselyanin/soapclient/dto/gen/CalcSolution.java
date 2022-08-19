
package com.cyrilselyanin.soapclient.dto.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calcSolution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calcSolution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discriminant" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="equationRoots" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quadratic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcSolution", propOrder = {
    "discriminant",
    "equationRoots",
    "quadratic"
})
public class CalcSolution {

    protected Integer discriminant;
    @XmlElement(nillable = true)
    protected List<Double> equationRoots;
    protected String quadratic;

    /**
     * Gets the value of the discriminant property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscriminant() {
        return discriminant;
    }

    /**
     * Sets the value of the discriminant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscriminant(Integer value) {
        this.discriminant = value;
    }

    /**
     * Gets the value of the equationRoots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equationRoots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquationRoots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getEquationRoots() {
        if (equationRoots == null) {
            equationRoots = new ArrayList<Double>();
        }
        return this.equationRoots;
    }

    /**
     * Gets the value of the quadratic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuadratic() {
        return quadratic;
    }

    /**
     * Sets the value of the quadratic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadratic(String value) {
        this.quadratic = value;
    }

}
