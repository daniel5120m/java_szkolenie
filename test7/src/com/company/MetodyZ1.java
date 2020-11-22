package com.company;

// ładowanie obiektu i klasy
import static com.company.InputReader.getUserInput;


public class MetodyZ1 {



    public static void main(String[] args) {
        print(add(getUserInput(), getUserInput()));

    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static void print(int results) {
        System.out.println("wynik: " + results);
    }

}
