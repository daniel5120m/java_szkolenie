package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class Zadanie6 {
    public static void main(String[] args) {
        /*
        Dana jest liczba naturalna n z przedziału 1 do 100, ciąg
         n liczb całkowitych oraz liczba całkowita k.
         Napisz program, który wyznaczy ilość wystąpień liczby
         k w podanym ciągu liczb
        */
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        System.out.println("wylosowane n: " + n);
        int k = random.nextInt(20) - 11;
        System.out.println("wylosowane k: " + k);
        int[] ciag = new int[n];
        for (int i = 0; i < ciag.length; i++) {
            ciag[i] = random.nextInt(20) - 11;
        }
        System.out.print("\n");
        System.out.println("Wygenerowana tablica: " + Arrays.toString(ciag));
        System.out.println("Wielkość tablicy: " + ciag.length);
        System.out.print("\n");
        long wystapienie = IntStream.of(ciag)
                .filter(number -> number == k)
                .count();
        System.out.println(k + " wystąpiło w ciągu " + wystapienie + " razy");
//        OptionalDouble srednia = IntStream.of(ciag)
//                .average();
//        System.out.println("średnia: " + srednia.getAsDouble());
        double srednia = IntStream.of(ciag)
                .average().getAsDouble();
        System.out.println("średnia: " + srednia);
        int suma = IntStream.of(ciag)
                .sum();
        System.out.println("sum: " + suma);
        int max = IntStream.of(ciag)
                .max().getAsInt();
        System.out.println("max: " + max);
        int min = IntStream.of(ciag)
                .min().getAsInt();
        System.out.println("min: " + min);
    }
}
