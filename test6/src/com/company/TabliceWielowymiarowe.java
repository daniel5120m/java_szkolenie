package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10}
        };
//        System.out.println(matrix[1][2]);
        for (int[] iArray : matrix) {
            for (int i : iArray) {
                System.out.println(i + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Matrix: [");
        for (int[] iArray : matrix) {
            System.out.println(Arrays.toString(iArray));
        }
        int sum = 0;
        System.out.println("]");
        for (int[] iArray : matrix) {
            for (int i : iArray) {
                sum += i;
            }
        }
        System.out.println("\n");
        // varArgs + mapowanie (map) + wygenerowanie wyniku tablicy (toArray)
        // value to nazwa zmiennej
        int[] streamResult = IntStream.of(1, 2, 3, 4)
                .map(value -> value + 1) // 2,3,4,5
                .map(value -> value * 2) // 4,6,8,10
                .toArray();
        System.out.println("Zabawy varArgs, mapowania, generowanie wyniku: \n"
                + Arrays.toString(streamResult));

        int[] tabliczka1 = {1, 2, 3, 4};
        int sumka1 = IntStream.of(tabliczka1)
                .map(zmienna1 -> zmienna1 + 1) // 2, 3, 4, 5
                .map(zmienna2 -> zmienna2 * 2) // 4, 5, 6, 7
                .sum();
        System.out.println("sumka1: "+ sumka1);
        // rangeClosed wypełnia wartościami z danego przedziału łącznie z zakresem
        int[] sumka2 = IntStream.rangeClosed(1,10).toArray();
        System.out.println("sumka1: "+Arrays.toString(sumka2));
        // range wypełnia wartościami z danego przedziału
        int[] sumka3 = IntStream.range(1,10).toArray();
        System.out.println("sumka1: "+Arrays.toString(sumka3));
        double srednia = IntStream.of(sumka3)
                .average()
                .stream()
                .sum();
        System.out.println("srednia: "+srednia);
    }
}
