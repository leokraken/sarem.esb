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
 * <p>Java class for ethnicGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ethnicGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseObject">
 *       &lt;sequence>
 *         &lt;element name="ethnicGroupCd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ethnicGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ethnicGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ethnicGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ethnicGroup", propOrder = {
    "ethnicGroupCd",
    "ethnicGroupCode",
    "ethnicGroupDescription",
    "ethnicGroupName"
})
public class EthnicGroup
    extends BaseObject
{

    protected Integer ethnicGroupCd;
    protected String ethnicGroupCode;
    protected String ethnicGroupDescription;
    protected String ethnicGroupName;

    /**
     * Gets the value of the ethnicGroupCd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEthnicGroupCd() {
        return ethnicGroupCd;
    }

    /**
     * Sets the value of the ethnicGroupCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEthnicGroupCd(Integer value) {
        this.ethnicGroupCd = value;
    }

    /**
     * Gets the value of the ethnicGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicGroupCode() {
        return ethnicGroupCode;
    }

    /**
     * Sets the value of the ethnicGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicGroupCode(String value) {
        this.ethnicGroupCode = value;
    }

    /**
     * Gets the value of the ethnicGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicGroupDescription() {
        return ethnicGroupDescription;
    }

    /**
     * Sets the value of the ethnicGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicGroupDescription(String value) {
        this.ethnicGroupDescription = value;
    }

    /**
     * Gets the value of the ethnicGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicGroupName() {
        return ethnicGroupName;
    }

    /**
     * Sets the value of the ethnicGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicGroupName(String value) {
        this.ethnicGroupName = value;
    }

}
