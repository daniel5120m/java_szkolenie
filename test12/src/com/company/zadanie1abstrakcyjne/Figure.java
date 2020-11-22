package com.company.zadanie1abstrakcyjne;

public abstract class Figure {
    private String name;
    public Figure() {
        this.name = "some figure";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract double getArea();
}