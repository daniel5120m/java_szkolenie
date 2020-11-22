package com.company;

import java.util.Scanner;
import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        // zadanie 3
        for (int i = 5; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}
