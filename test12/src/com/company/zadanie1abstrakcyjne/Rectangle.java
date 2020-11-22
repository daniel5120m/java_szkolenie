package com.company.zadanie1abstrakcyjne;

public class Rectangle extends Figure{
    private double a;
    private double b;
    public Rectangle(String name, double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "name="+super.getName()+
                ", a=" + a +
                ", b=" + b +
                '}';
    }
    @Override
    public double getArea() {
        return a*b;
    }
}
