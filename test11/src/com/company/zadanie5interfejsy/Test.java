package com.company.zadanie5interfejsy;

public class Test {
    public static void main(String[] args) {

        Vacuum vacuum = new Vacuum();
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        Socket socket = new Socket();

        System.out.println("Odkurzacz");
        // odkurzanie
        vacuum.clean();
        // włączenie odkurzacza do gniazdka
        socket.plugIn(vacuum);
        // odkurzanie
        vacuum.clean();
        // odłączenie odkurzacza z gniazdka
        socket.plugOut();
        // odkurzanie
        vacuum.clean();

        System.out.println("Ekspres");
        // mielenie kawy
        coffeeGrinder.grindCoffee();
        // włączenie ekspresu do gniazdka
        socket.plugIn(coffeeGrinder);
        // włączenie ekspresu
        coffeeGrinder.electricityOn();
        // mielenie kawy
        coffeeGrinder.grindCoffee();
        // odłączenie ekspresu z gniazdka
        socket.plugOut();
        // mielenie kawy
        coffeeGrinder.grindCoffee();
    }
}
