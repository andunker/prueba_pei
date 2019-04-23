//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.23 a las 09:52:46 AM COT 
//


package com.bolsadeideas.pruebafabio.app.models.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreditCardWithMovements complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreditCardWithMovements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movements" type="{http://www.peiky.com/payment}Movement" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="expDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="franchise" type="{http://www.peiky.com/payment}Franchise" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardWithMovements", propOrder = {
    "movements"
})
public class CreditCardWithMovements {

    @XmlElement(required = true)
    protected List<Movement> movements;
    @XmlAttribute(name = "token")
    protected String token;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "expDate")
    protected String expDate;
    @XmlAttribute(name = "franchise")
    protected Franchise franchise;

    /**
     * Gets the value of the movements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Movement }
     * 
     * 
     */
    public List<Movement> getMovements() {
        if (movements == null) {
            movements = new ArrayList<Movement>();
        }
        return this.movements;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad expDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Define el valor de la propiedad expDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDate(String value) {
        this.expDate = value;
    }

    /**
     * Obtiene el valor de la propiedad franchise.
     * 
     * @return
     *     possible object is
     *     {@link Franchise }
     *     
     */
    public Franchise getFranchise() {
        return franchise;
    }

    /**
     * Define el valor de la propiedad franchise.
     * 
     * @param value
     *     allowed object is
     *     {@link Franchise }
     *     
     */
    public void setFranchise(Franchise value) {
        this.franchise = value;
    }

}
