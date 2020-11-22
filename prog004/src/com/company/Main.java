package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String login1 = null;
        String haslo1 = null;
        String login2;
        String haslo2;
        boolean hasloJest = false;
        boolean wyjscie = true;
        while (wyjscie) {
            System.out.println("1 - dodaj nowego użyszkodnika");
            System.out.println("2 - zaloguj");
            System.out.println("3 - wyjdź z programu");
            System.out.println("Wybierz operację");
            String wybor = scanner.next();
            switch (wybor) {
                case "1":
                    System.out.println("podaj login");
                    login1 = scanner.next();
                    System.out.println("podaj haslo");
                    haslo1 = scanner.next();
                    System.out.println("Podane dane:");
                    System.out.println("Login: " + login1);
                    System.out.println("Haslo: " + haslo1);
                    hasloJest = true;
                    System.out.println("dodano nowego użytkownika");
                    break;
                case "2":
                    if (hasloJest == false) {
                        System.out.println("Brak użytkowników w bazie\nzałóż najpierw konto");

                    } else {
                        System.out.println("Logowanie...");
                        System.out.println("Podaj login");
                        login2 = scanner.next();
                        System.out.println("Podaj hasło:");
                        haslo2 = scanner.next();
                        if (login1.equals(login2) && haslo1.equals(haslo2)) {
                            System.out.println("zalogowano");
                        } else {
                            System.out.println("uuuu coś nie pykło z loginem lub hasłem");
                        }
                    }
                    break;
                case "3":
                    System.out.println("pa pa");
                    wyjscie = false;
                    break;
                default:
                    System.out.println("a co to miało być? nie znam się, nie pomogę");
                    break;

            }
        }
    }
}