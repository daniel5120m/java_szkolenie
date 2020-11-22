package com.company.zadania;

public class Glass {
    private int waterM1;
    private int maxM1;

    public Glass(int waterM1, int maxM1) {
        this.waterM1 = waterM1;
        this.maxM1 = maxM1;
    }

    public void fill(int waterToAddInM1) {
        if (waterToAddInM1 >= 0 && waterM1 + waterToAddInM1 <= maxM1) {
            waterM1 += waterToAddInM1;
        } else if (waterToAddInM1 < 0) {
            waterM1 = 0;
        } else {
            waterM1 = maxM1;
        }
    }

    public void gulp() {
        if (waterM1 >= 50) {
            waterM1 -= 50;
        } else {
            waterM1 = 0;
        }
    }

    public void pourOut() {
        waterM1 = 0;
    }

    public int getWaterM1() {
        return waterM1;
    }

    public void printWaterM1() {
        System.out.println(waterM1);
    }
}
