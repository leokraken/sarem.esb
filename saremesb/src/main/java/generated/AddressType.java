//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.06 at 11:01:52 PM UYT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseObject">
 *       &lt;sequence>
 *         &lt;element name="addressTypeCd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="addressTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressType", propOrder = {
    "addressTypeCd",
    "addressTypeCode",
    "addressTypeDescription",
    "addressTypeName"
})
public class AddressType
    extends BaseObject
{

    protected Integer addressTypeCd;
    protected String addressTypeCode;
    protected String addressTypeDescription;
    protected String addressTypeName;

    /**
     * Gets the value of the addressTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressTypeCd() {
        return addressTypeCd;
    }

    /**
     * Sets the value of the addressTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressTypeCd(Integer value) {
        this.addressTypeCd = value;
    }

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeCode(String value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the addressTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeDescription() {
        return addressTypeDescription;
    }

    /**
     * Sets the value of the addressTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeDescription(String value) {
        this.addressTypeDescription = value;
    }

    /**
     * Gets the value of the addressTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeName() {
        return addressTypeName;
    }

    /**
     * Sets the value of the addressTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeName(String value) {
        this.addressTypeName = value;
    }

}
