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
 * <p>Java class for religion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="religion">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseObject">
 *       &lt;sequence>
 *         &lt;element name="religionCd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="religionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "religion", propOrder = {
    "religionCd",
    "religionCode",
    "religionDescription",
    "religionName"
})
public class Religion
    extends BaseObject
{

    protected Integer religionCd;
    protected String religionCode;
    protected String religionDescription;
    protected String religionName;

    /**
     * Gets the value of the religionCd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReligionCd() {
        return religionCd;
    }

    /**
     * Sets the value of the religionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReligionCd(Integer value) {
        this.religionCd = value;
    }

    /**
     * Gets the value of the religionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionCode() {
        return religionCode;
    }

    /**
     * Sets the value of the religionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionCode(String value) {
        this.religionCode = value;
    }

    /**
     * Gets the value of the religionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionDescription() {
        return religionDescription;
    }

    /**
     * Sets the value of the religionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionDescription(String value) {
        this.religionDescription = value;
    }

    /**
     * Gets the value of the religionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionName() {
        return religionName;
    }

    /**
     * Sets the value of the religionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionName(String value) {
        this.religionName = value;
    }

}
