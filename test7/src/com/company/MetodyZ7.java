package com.company;

import static com.company.InputReader.getUserInput;

public class MetodyZ7 {
    public static void main(String[] args) {
        int sum = 0;

        int number = getUserInput();
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        print(sum);
    }

    static boolean isSquareOfIntegerNuber(int num) {
        double sqrt = Math.sqrt(num);
        return num % sqrt == 0;
    }

    public static void print(int results) {
        System.out.println("wynik: " + results);
    }
}
