package com.company;

public class MetodyZ14 {
    public static void main(String[] args) {
        getMaxNumberOfDividers(2, 10000);
    }

    static int checkDivide(int liczba) {
        int sum = 0;
        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                sum += 1;
            }
        }
        return sum;
    }

    static int getMaxNumberOfDividers(int start, int end) {
        int result = checkDivide(start);
        int counter = start;
        for (int i = start; i <= end; i++) {
            if (checkDivide(i) > result) {
                result = checkDivide(i);
                counter = i;
            }
        }
        print("dzielników:",result);
        print("liczba:", counter);
        return result;
    }

    public static void print(String text,int results) {
        System.out.println(text + " " + results);
    }
}
