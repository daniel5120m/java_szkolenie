package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        // zadanie 3
        System.out.println("\nzadanie 3");
        int int3A = 100;
        int int3B = 30000;
        int int3Iloczyn = int3A * int3B;
        System.out.println("Iloczyn int3A i int3B: " + int3Iloczyn);

        // zadanie 4
        System.out.println("\nzadanie 4");
        // zmienna referencyjna typu scanner wskazuje na obiekt typu scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe calkowita");
        int int4A = scanner.nextInt();
        System.out.println("podana liczba " + int4A);
        System.out.println("ostatnia liczba ze zmiennej: " + (int4A % 10));

        // zadanie 6
        System.out.println("\nzadanie 6");
        Scanner d6 = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe rzeczywista");
        double d6A = d6.nextInt();
        System.out.println("podaj druga liczbe rzeczywista");
        double d6B = d6.nextInt();
        double double6 = d6A / d6B;
        System.out.println("wynik ilorazu: " + double6);

        // zadanie 7
        System.out.println("\nzadanie 7");
        Scanner d7 = new Scanner(System.in);
        int int7A = d7.nextInt();

        // zadanie 10
        System.out.println("\nzadanie 10");
//        Scanner long10 = new Scanner(System.in);
//        System.out.println("podaj duza wartosc");
//        long long10A = (long) long10.nextInt();
        long long10z;
        long10z = 8123213543534543l;
        System.out.println(long10z);
        long10z = 8123_213543_534543L;
        System.out.println(long10z);

        // zadanie 11
        System.out.println("\nzadanie 11");
        Random z11 = new Random();
        System.out.println(z11.nextInt(100)+1);

        // zadanie 12
        System.out.println("\nzadanie 12");
        Scanner z12 = new Scanner(System.in);
        System.out.println("podaj A");
        int int12A = z12.nextInt();
        System.out.println("podaj B");
        int int12B = z12.nextInt();
        System.out.println("podaj C");
        int int12C = z12.nextInt();
        double d12;
//        d12 = (int12A + int12B + int12C)/3d;
        d12 = (int12A + int12B + int12C)/3.0;
        System.out.println("srednia: " + d12);

*/
        // zadanie 4x
        System.out.println("\nzadanie 4x");
        Scanner scanner4x = new Scanner(System.in);
        int int4xA = scanner4x.nextInt();
        int int4xB = scanner4x.nextInt();
        int int4xC = scanner4x.nextInt();
        if (int4xA >= int4xB && int4xA > int4xC) {
                System.out.println(int4xA + " jest najwieksza");
            }
        if (int4xB >= int4xA && int4xB >= int4xC) {
                System.out.println(int4xC + " jest najwieksza");
            }
        if (int4xC >= int4xA && int4xC >= int4xB) {
                System.out.println(int4xB + " jest najwieksza");
            }



    }
}
