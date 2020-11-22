package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie8 {
    // public - kwantyfikator dostępności
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        boolean petla = true;
        boolean imieJest;
        String imie;

        String menu = "\n\nMenu: \n0-wyjście z programu\n1-dodawanie znajomego\n";
        menu = menu + "2-wyszukiwanie\n3-usunięcie znajomego\n4-wyświetl wszystkich";


        String[] imiona = new String[10];
        imiona[0] = "Stefan";
        imiona[1] = "Jacek";
        imiona[2] = "Błażej";

        while (petla) {
            System.out.println(menu);
            String wybor = scaner.next();
            switch (wybor) {
                case "0":
                    System.out.printf("Uuu wychodzę, nie wiem kiedy wrócę");
                    System.out.println("\n");
                    petla = false;
                    break;
                case "1":
                    System.out.println("Dodawanie nowej osoby");
                    System.out.print("Podaj imię: ");
                    for (int i = 0; i < imiona.length; i++) {
                        if ("".equals((imiona[i])) || imiona[i] == null) {
                            imie = scaner.next();
                            imiona[i] = imie;
                            System.out.println("Dodano znajomego: " + imiona[i]);
                            break;
                        }
                    }
                    System.out.println("\n");
                    break;
                case "2":
                    System.out.print("Kogo mam znaleźć? ");
                    imie = scaner.next();
                    imieJest = true;
                    for (int i = 0; i < imiona.length; i++) {
                        if (imie.equals(imiona[i])) {
                            System.out.println("Mamy go: " + imiona[i]);
                            System.out.println("Wisi pod indeksem: " + i);
                            imieJest = false;
                        } else if (i == imiona.length-1 && imieJest) {
                            System.out.println("Nie znam gościa, zawsze możemy go dodać");
                        }
                    }
                    System.out.println("\n");
                    break;
                case "3":
                    System.out.print("Kogo mam usunąć? ");
                    imie = scaner.next();
                    imieJest = true;
                    for (int i = 0; i < imiona.length; i++) {
                        if (imie.equals(imiona[i])) {
                            System.out.println("Mamy go: " + imiona[i]);
                            System.out.println("Wisi pod indeksem: " + i);
                            System.out.println("Rozpoczynam procedurę delejtowania...");
                            imiona[i] = null;
                            System.out.println("Zdelejtowany ten " + imie);
                            imieJest = false;
                        } else if (i == imiona.length-1 && imieJest) {
                            System.out.println("Nie znam gościa, nie zrobię mu delejta");
                        }
                    }
                    System.out.println("\n");
                    break;
                case "4":
                    for (String i : imiona) {
                        System.out.println(i);
                    }
                    System.out.println("\n");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Zły wybór, spróbuj jeszcze raz");
                    System.out.println("\n");
                    break;
            }
        }
    }
}
