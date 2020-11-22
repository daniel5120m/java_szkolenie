package com.company;

public class Chimpanzee extends Ape {
    // super(); zostanie z automatu dodane w tym miejscu czyli wywołanie nadrzędnego
    // konstruktora Ape
    // no args constructor
    public Chimpanzee() {
        System.out.println("Chimpanzee");
    }
    public static void main(String[] args) {
        new Chimpanzee(); // Primate Ape
    }
}
