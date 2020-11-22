package com.company.zadanie5interfejsy;

public class CoffeeGrinder implements ElectricDevice {
    // flaga true false
    private boolean hasElectricity;

    // konstruktor, który ustawia zmienną hasElectrocity (domyślnie jest false
    public CoffeeGrinder() {
        hasElectricity = false;
    }

    // włączenie ekspresu
    @Override
    public void electricityOn() {
        hasElectricity = true;
    }

    // wyłączenie ekspresu
    @Override
    public void electricityOff() {
        hasElectricity = false;
    }

    // mielenie kawy
    public void grindCoffee() {
        if (hasElectricity) {
            System.out.println("Wrrrrrrrrr");
        } else {
            System.out.println("No grinding, it’s not working");
        }
    }
}
