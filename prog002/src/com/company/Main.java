package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        // zadanie 1
        System.out.println("zadanie 1");
        Scanner scanner1 = new Scanner(System.in);
        String str1A = "tak";
        char char1A, char1B;

*/
        // zadanie 5
        System.out.println("zadanie 5");
        Scanner scanner5 = new Scanner(System.in);
        int int5A = scanner5.nextInt();
        System.out.println("podano liczbe: " + int5A + ", podzielna przez 3? " + (int5A % 3 == 0?"tak":"nie"));

    }
}
