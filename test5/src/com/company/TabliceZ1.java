package com.company;

import java.util.Scanner;
import java.util.Random;

public class TabliceZ1 {
    public static void main(String[] args) {
        int n;
//        Scanner scaner = new Scanner(System.in);
        Random random = new Random();
//        System.out.print("Podaj rozmiar tablicy: ");
//        n = scaner.nextInt();
//        int[] t1 = new int[n];
        int[] t1 = new int[]{0, 1, 2, 3,5};
//        for (int i=0;i < n;i++) {
//            t1[i] = random.nextInt(9)+1;
//            System.out.print(t1[i] + " ");
//        }
        for (int i = t1.length-1; i>=0 ;i--) {
            System.out.printf(t1[i] + " ");
        }
    }
}
