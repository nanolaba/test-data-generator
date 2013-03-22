package com.nanolaba.test_data_generator.countries.russian;

import junit.framework.Assert;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.util.List;

public class CountryManagerTest {

    @Test
    public void testGetCountries() throws JAXBException {
        CountryManager countryManager = new CountryManager();
        List<Country> countries = countryManager.getCountries();

        for (Country country : countries) {
            printCountry(country);
        }

        Assert.assertNotNull(countries);
    }

    private void printCountry(Country country) {
        System.out.println(country.getName());
        for (Region region : country.getRegions()) {
            printRegion(region);
        }
    }

    private void printRegion(Region region) {
        System.out.println("    " + region.getName());
        for (City city : region.getCities()) {
            printCity(city);
        }
    }

    private void printCity(City city) {
        System.out.println("        " + city.getName());
    }
}
