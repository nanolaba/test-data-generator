package com.nanolaba.test_data_generator.countries.russian;

import java.io.Serializable;

public class City implements Serializable {

    private static final long serialVersionUID = -341134497649972262L;

    private Country country;
    private Region region;
    private String name;
    private String id;

    public City() {/**/}

    public City(Country country, Region region, String name, String id) {
        this.country = country;
        this.region = region;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
