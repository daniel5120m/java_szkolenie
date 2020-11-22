package com.company;

import java.util.*;

public class KolekcjeZ4 {
    public static void main(String[] args) {
        /*
            program ma zamieniać liczbę całkowitą na system binarny
            np. 5
            101
         */
        Scanner scanner = new Scanner(System.in);
//        Queue<Integer> integerQueue = new ArrayDeque<>();
        Stack<Integer> integerStack = new Stack<>();

        System.out.println("Podaj liczbę w sys. dziesiętnym");
        int liczba = scanner.nextInt();
        int tmp;
        while (liczba != 0) {
            integerStack.add(liczba % 2);
            liczba /= 2;
        }
        System.out.println(integerStack);
        StringBuilder bin = new StringBuilder();
        while (!integerStack.isEmpty()) {
            bin.append(integerStack.pop());
        }
        System.out.println(bin);
    }
}
