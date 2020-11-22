package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // switch..case
        Scanner scaner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int a = scaner.nextInt();
        switch (a) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(a);
                break;
            case 3:
                System.out.println(a);
                break;
            default:
                System.out.println("żaden case nie wskoczył, " + a);
                break;
        }

        String[] ablica = new String[10];
    }
}
