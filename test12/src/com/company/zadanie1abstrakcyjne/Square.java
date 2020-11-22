package com.company.zadanie1abstrakcyjne;

public class Square extends Rectangle{
    public Square(String name, double a) {
        super(name, a, a);
    }
    @Override
    public String toString() {
        return "Rectangle->Square{ "+
                "name:"+super.getName()+
                ", a = "+super.getA()+"}";
    }
}
