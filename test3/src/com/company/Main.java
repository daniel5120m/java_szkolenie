package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // stringi (niekoniecznie w postaci bielizny)
        // typy złożone (obiektowe) np. String, Scanner, Boolean, Random
        System.out.println("stringi");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hello";
        // tworzenie nowego obiektu na klasie String (stworzone na stercie)
        String s2 = new String("Hello");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println(s1 == s2);
        // porównywanie stringów zawsze za pomocą metody equals()
        System.out.println(s1.equals(s2));
        System.out.println("Hello".equals(s2));
        // stringi są niemutowalne czyli raz stworzony obiekt String już się nie zmieni
        // metoda concat
        // zostanie utworzony nowy string ale wartość s1 się nie zmieni
        // modyfikacja nie jest zapisywana w oryginalnym stringu
        s1.concat("World");
        System.out.println(s1);
        // jeżeli chcemy zmienić wartość stringa, musimy zrobić przypisanie
//        s1 = s1.concat("World");
        System.out.println(s1.concat("World"));
        // metoda substring wybiera, od którego miejsca ma być brany
        // string (można podawać początek i koniec)
        String s3 = "Ala ma kota a kot ma Alę";
        System.out.println(s3.substring(2, 8));
        System.out.println(s3.substring(2, 8)+"jakiś śmieszny tekst");
        System.out.println(s3.substring(0,3)+" "+s3.substring(13,17));
        // metoda charAt konkretny znak
        System.out.println(s3.charAt(5));
        // metoda lenght zwraca długość stringa
        System.out.println(s3.length());
        // metoda contains sprawdza czy string zawiera dany ciąg
        System.out.println("s3 zawiera słowo kot?"+s3.contains("kot"));
        // sprawdzanie długości hasła
        String password = "tajne";
        if(password.length() > 8 && password.contains("t")) {
            System.out.println("Dobre hasło");
        } else {
            System.out.println("Złe hasło");
        }
        // sprawdzenie wielkosci znaku Character.toString('a')
        // dzielenie stringow metoda split(number) a dostęp do poszczególnych indeksów (parts[0])
        // string builder (nie jest bezpieczny w środowisku wielowątkowym
        // string buffer
        // pobieranie i sprawdzanie hasła
        System.out.println("Podaj hasło do sprawdzenia");
        String haslo1 = scanner.next();
        Random z11 = new Random();
        if(haslo1.length() >= 10) {
            System.out.println("Hasło spełnia wymagania min. 10 znaków");
            System.out.println("Podaj hasło, żeby się zalogować");
            String haslo2 = scanner.next();
            Random losoweH = new Random();
            if(haslo1.equals(haslo2)) {
                System.out.println("Dobre hasło - ZALOGOWANO");
            } else {
                System.out.println("Złe hasło");
//                haslo1 = losoweH.nextDouble();
//                System.out.println(haslo1);
            }
        } else {
            System.out.println("Hasło nie spełnia wymagań długości (min. 10 znaków");
        }





    }

}
