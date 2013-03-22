package com.nanolaba.test_data_generator.countries.russian;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Country implements Serializable {

    private static final long serialVersionUID = 4635713753990763442L;

    private List<Region> regions = new LinkedList<Region>();

    private String name;
    private String id;

    public Country() {
    }

    public Country(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
