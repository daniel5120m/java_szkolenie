package com.company.zadanie1abstrakcyjne;

public class Circle extends Figure{
    private double r;
    public Circle(String name, double r) {
        super.setName(name);
        this.r = r;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "name="+super.getName()+
                ", r=" + r +
                '}';
    }
    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
