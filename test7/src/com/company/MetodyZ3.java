package com.company;

// ładowanie obiektu i klasy
import static com.company.InputReader.getUserInput;

public class MetodyZ3 {

    public static void main(String[] args) {
        print(multiply(getUserInput(), getUserInput()));
    }

    public static int multiply(int m1, int m2) {
        return m1 * m2;
    }

    public static void print(int results) {
        System.out.println("wynik: " + results);
    }

}
