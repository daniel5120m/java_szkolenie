package com.company.cars;

public class Car {
    public int speed;
    int numberOfWheels;
    String color;

    public Car() {
//        this()
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(int speed, int numberOfWheels, String color) {
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public void przyspiesz() {
        speed+=50;
    }

    public void hamuj() {
        speed-=50;
    }
}
