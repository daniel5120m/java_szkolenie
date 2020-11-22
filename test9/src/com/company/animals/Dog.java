package com.company.animals;

public class Dog {
    String name;
    // ustawienie zmiennej na prywatną
    private int numberOfPaws;

    // konstruktor
    public Dog(String name) {
        this.name = name;
    }

    // kolejny konstruktor
    public Dog(String name, int numberOfPaws) {
        this.name = name;
        this.numberOfPaws = numberOfPaws;
    }



    public void introduce() {
        System.out.println("Nazywam się: " + name);
        System.out.println("Mam: " + numberOfPaws);
    }

    // metoda wyświetlenia wartości prywatnej zmiennej numberOfPawns
    public int getNumberOfPawn() {
        return numberOfPaws;
    }



}
