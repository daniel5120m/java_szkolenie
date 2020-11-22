package com.company;


import java.util.Scanner;

public class MetodyZ16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmpPesel = scanner.next();
        String[] pesel = tmpPesel.split("");
    }

    static boolean peselCheck(String[] pes) {
        boolean elCheck = true;

        if (pes.length == 11) {
            for (int i = 0; i < 11; i++) {
                if (Integer.valueOf(pes[i]) >= 0 && Integer.valueOf(pes[i]) <= 9) {

                } else {
                    print("podany pesel nie jest liczbą", "!");
                    break;
                }
            }
        } else {
            print("Podany pesel nie ma 11 cyfr", "!");
        }
        return true;
    }

    public static void print(String text, String results) {
        System.out.println(text + " " + results);
    }

}
