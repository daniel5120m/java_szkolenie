package com.company;

import java.util.Scanner;
import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        // zadanie 7
        Random losowanie = new Random();
        int[] liczby = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
        int[] lotek = new int[6];
        for (int i = 0; i <= 5; i++) {
            lotek[i] = losowanie.nextInt(48) + 1;
            System.out.print(lotek[i] + " ");

        }
    }
}

