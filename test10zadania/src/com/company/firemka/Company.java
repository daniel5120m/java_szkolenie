package com.company.firemka;

import java.util.List;

public class Company {
    private String companyName;
    private String place;

    public Company(String name, String place) {
        this.companyName = name;
        this.place = place;
    }

    public String getName() {
        return companyName;
    }

    public String getPlace() {
        return place;
    }

}
