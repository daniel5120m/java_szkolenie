package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie7 {
    public static int n = 5;
    public static int m = 5;

    public static int rr(int zMin, int zMax) {
        Random randomek = new Random();
        int losowa = randomek.nextInt(zMax - zMin) + zMin;
        return losowa;
    }

    public static void main(String[] args) {
        /*
        Wprowadź liczby całkowite do dwuwymiarowej tablicy liczb o wymiarach n wierszy
         i m kolumn (n i m zadeklarowane jako stałe w programie) oraz oblicz sumę wyrazów
         w tablicy. Znajdź minimum i maksimum w wierszach tablicy dwuwymiarowej.
        */
        /*
        int[][] tablicaZ7 = {
                {1, 7, 3, 5, 6},
                {21, 51, 13, 38, 27},
                {2, 17, 3, 9, 10},
                {10, 12, 100, 9, 7},
                {100, 5, 50, 55, 105}
        };
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres dla funkcji losowej");
        System.out.print("Min: ");
        int rrMin = scanner.nextInt();
        System.out.print("Max: ");
        int rrMax = scanner.nextInt();
        int[][] tablicaZ7 = new int[5][5];

        for (int i = 0; i < tablicaZ7.length; i++) {
            for (int j = 0; j < tablicaZ7.length; j++) {
                tablicaZ7[i][j] = rr(rrMin, rrMax + 1);
            }
        }
        System.out.println("Tablica wypełniona wartościami losowymi");
        System.out.println("z zakresu " + rrMin + " - " + rrMax);
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int[] iArray : tablicaZ7) {
            for (int i : iArray) {
                max = Math.max(max, i);
                min = Math.min(min, i);
                suma += i;
            }
        }
        System.out.println("\n");
        System.out.println("Suma elementów: " + suma);
        System.out.println("Wartość maksymalna: " + max);
        System.out.println("Wartość minimalna: " + min);
        System.out.println("\n");
        System.out.println("tablicaZ7 = [");
        for (int[] iArr : tablicaZ7) {
            System.out.println(Arrays.toString(iArr));
        }
        System.out.println("]");
    }
}
