package com.company.animals;

public class Owl {
    private String name;
    private int numberOfPaws;
    private int numberOfWings;

    public Owl() {
        this("Puhacz", 2, 2);
    }

    public Owl(String name, int numberOfPaws, int numberOfWings) {
        this.name = name;
        this.numberOfPaws = numberOfPaws;
        this.numberOfWings = numberOfWings;
    }

    public String getName() {
        return name;
    }

}
