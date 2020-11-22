package com.company;

import java.util.Scanner;

public class InputReader {
    private static Scanner scanner = new Scanner(System.in);

    public static int getUserInput() {
        // docelowo nie ma sensu żeby skaner był wywoływany za każdym razem

        System.out.println("Podaj liczbę: ");
        return scanner.nextInt();

    }
}

