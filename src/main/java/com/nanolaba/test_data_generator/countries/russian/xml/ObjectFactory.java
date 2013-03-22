package com.nanolaba.test_data_generator.countries.russian.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.nanolaba.test_data_generator.countries package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Rocid_QNAME = new QName("", "rocid");

    /** Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nanolaba.test_data_generator.countries */
    public ObjectFactory() {
    }

    /** Create an instance of {@link RocidType } */
    public RocidType createRocidType() {
        return new RocidType();
    }

    /** Create an instance of {@link CityType } */
    public CityType createCityType() {
        return new CityType();
    }

    /** Create an instance of {@link CountryType } */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /** Create an instance of {@link RegionType } */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link RocidType }{@code >}} */
    @XmlElementDecl(namespace = "", name = "rocid")
    public JAXBElement<RocidType> createRocid(RocidType value) {
        return new JAXBElement<RocidType>(_Rocid_QNAME, RocidType.class, null, value);
    }

}
