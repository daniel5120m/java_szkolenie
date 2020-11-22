package com.company.zadanie5interfejsy;

public class Vacuum implements ElectricDevice {
    // flaga true false
    private boolean hasElectricity;

    // konstruktor, który ustawia zmienną hasElectrocity (domyślnie jest false
    public Vacuum() {
        hasElectricity = false;
    }

    // włączenie odkurzacza
    @Override
    public void electricityOn() {
        hasElectricity = true;
    }

    // wyłączenie odkurzacza
    @Override
    public void electricityOff() {
        hasElectricity = false;
    }

    // odkurzanie
    public void clean() {
        if (hasElectricity) {
            System.out.println("Buuuuuuuuuuu");
        } else {
            System.out.println("No cleaning, it’s not working");
        }
    }
}
