package com.company.pliki;

import java.util.Objects;

// ALT + INSERT - otwiera menu automatycznego generowania kodu np. konstruktora

public class Planet {
    private String name;
    private String weight;
    private String distanceToSun;

    public Planet(String name, String weight, String distanceToSun) {
        this.name = name;
        this.weight = weight;
        this.distanceToSun = distanceToSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(String distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", distanceToSun='" + distanceToSun + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return name.equals(planet.name) &&
                weight.equals(planet.weight) &&
                distanceToSun.equals(planet.distanceToSun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, distanceToSun);
    }
}
