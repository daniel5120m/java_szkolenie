package com.company;

import java.util.Scanner;
import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        // zadanie 5
        System.out.println("Podaj ilość liczb do sumy");
        int n = scaner.nextInt();
        int sumaZ5 = 0;
        for (int i = 1; i <= n; i++) {
            sumaZ5 = sumaZ5 + i;
            if (i == n) {
                System.out.println("Suma i: " + sumaZ5);
            }
        }
        System.out.println("\n");
    }
}
