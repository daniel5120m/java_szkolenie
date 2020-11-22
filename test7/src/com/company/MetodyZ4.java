package com.company;

import static com.company.InputReader.getUserInput;
import static com.company.ChceckIntZero.getIntInput;

public class MetodyZ4 {
    public static void main(String[] args) {
        // print(multiply(getUserInput(), getUserInput()));
        print(divide(getUserInput(), getUserInput()));
    }
    static void print(int result) {
        System.out.println(result);
    }

    public static int divide(int m1, int m2) {
        return m1 / m2;
    }
}
