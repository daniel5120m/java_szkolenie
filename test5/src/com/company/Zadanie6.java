package com.company;

import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        boolean petla = true;
        Random losowanie = new Random();
        int los = losowanie.nextInt(10);
        while (petla) {
            System.out.print("Podaj liczbę: ");
            int liczba = scaner.nextInt();
            if (liczba > los) {
                System.out.println("Podana liczba jest większa niż wylosowana");
            } else if (liczba < los) {
                System.out.println("Podana liczba jest niższa niż wylosowana");
            } else {
                System.out.println("Brawo, wylosowaną liczbą jest " + los);
                petla = false;
            }
        }
    }
}
