package com.nanolaba.test_data_generator.countries.russian;

import com.nanolaba.test_data_generator.countries.russian.xml.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.LinkedList;
import java.util.List;

public class CountryManager {


    public List<Country> getCountries() throws JAXBException {

        List<Country> res = new LinkedList<Country>();

        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement unmarshal = (JAXBElement) unmarshaller.unmarshal(Thread.currentThread().getContextClassLoader().getResourceAsStream("cities.xml"));

        RocidType value = (RocidType) unmarshal.getValue();
        for (CountryType countryType : value.getCountry()) {
            res.add(new Country(countryType.getName(), countryType.getCountryId()));
        }

        for (RegionType regionType : value.getRegion()) {
            for (Country country : res) {
                if (regionType.getCountryId().equals(country.getId())) {
                    country.getRegions().add(new Region(country, regionType.getName(), regionType.getRegionId()));
                }
            }
        }
        for (CityType cityType : value.getCity()) {
            for (Country country : res) {
                for (Region region : country.getRegions()) {
                    if (cityType.getRegionId().equals(region.getId())) {
                        region.getCities().add(new City(country, region, cityType.getName(), cityType.getCityId()));
                    }
                }
            }
        }


        return res;
    }
}
