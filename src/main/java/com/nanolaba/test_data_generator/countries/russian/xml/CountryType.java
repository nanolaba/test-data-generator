package com.nanolaba.test_data_generator.countries.russian.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="countryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryType", propOrder = {
        "countryId",
        "cityId",
        "name"
})
public class CountryType {

    @XmlElement(name = "country_id", required = true)
    protected String countryId;
    @XmlElement(name = "city_id", required = true)
    protected String cityId;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the countryId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryId(String value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the cityId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}
