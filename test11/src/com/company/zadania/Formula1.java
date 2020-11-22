package com.company.zadania;

public class Formula1 {
    private String brand;
    private String driverName;

    public Formula1(String brand, String driverName) {
        this.brand = brand;
        this.driverName = driverName;
    }

    private String getBrand() {
        return brand;
    }

    private String getDriverName() {
        return driverName;
    }

}
