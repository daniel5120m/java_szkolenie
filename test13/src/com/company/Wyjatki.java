package com.company;

import static java.lang.StrictMath.sqrt;

public class Wyjatki {
    private double num;

    public Wyjatki(double num) {
        this.num = num;
    }

    private double mathSqrt(double liczba) {
        if (liczba < 0) {
            throw new IllegalArgumentException("Podano liczbę ujemną");
        }
        return sqrt(liczba);

    }

    public double getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
