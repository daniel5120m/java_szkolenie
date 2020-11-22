package com.company.zadania;

public class Car {
    // private - kwantyfikator
    // pola
    private String brand;
    private String model;
    private double price;

    // konstruktor
    public Car (String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // metoda dostępowa
    public String getBrand() {
        // return this.brand; formalnie trzeba robić
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

}
