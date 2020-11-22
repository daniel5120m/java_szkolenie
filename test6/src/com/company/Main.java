package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // tablice cdn...
        int[] array1;
        int[] array2;
        int array3[];
        int array4[];
        // niezalecane tworzenie zmiennej x i tablicy array
        int x, array[];
        x = 5;
        array = new int[9];
        // coś co nie zadziała (nie można tak robić)
//        array4 = {1,2,3,4};
        test(new int[]{1, 2, 3, 4});
        int[] array5 = new int[5];
        // metoda fill umożliwia wypełnianie tablicy
        Arrays.fill(array5, 1, 3, 5);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(array4));
        // wyświetlenie tablicy za pomocą metody toString,
        // która zwraca tablicę w formie ciągu znaków
        System.out.println(Arrays.toString(array5));
        Arrays.fill(array5, 1);
        System.out.println(Arrays.toString(array5));
        int[] array6 = new int[5];
        for (int a : array6) {
            a = 1; // to nic nie da, nie wypełni tablicy
        }
        System.out.println(Arrays.toString(array6));


    }

    public static void test(int[] tab) {

    }



}
