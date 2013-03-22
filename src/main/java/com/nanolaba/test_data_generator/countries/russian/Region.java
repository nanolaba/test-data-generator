package com.nanolaba.test_data_generator.countries.russian;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Region implements Serializable {

    private static final long serialVersionUID = 6668553085838188214L;

    private Country country;
    private String name;
    private String id;
    private List<City> cities = new LinkedList<City>();

    public Region() {
    }

    public Region(Country country, String name, String id) {
        this.country = country;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
