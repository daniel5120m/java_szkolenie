package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KolekcjeZ3 {
    public static void main(String[] args) {
        /*
            program, który symuluje działanie słownika polsko-angielskiego
            np. podaję słówko po Polsku
            mama
            poangielsku to mother
         */
        Scanner scanner = new Scanner(System.in);
        String inputString = new String();

        Map<String, String> mapSlownik = new HashMap<>();
        mapSlownik.put("niebieski", "blue");
        mapSlownik.put("żółty", "yellow");
        mapSlownik.put("zielony", "green");
        mapSlownik.put("czerwony", "red");
        mapSlownik.put("czarny", "black");
        System.out.println("Wielkość słownika: " + mapSlownik.size());
        System.out.println("Zawartość: " + mapSlownik);

        // zebranie kluczy i przyporządkowanych wartości wyświetlone
        // w czytelniejszej formie
        // Set<Map.Entry<K,V>> entrySet() - zwraca zbiór obiektów
        // typu Map.Entry, które reprezentują kolejne rekordy w mapie
        // na zasadzie klucz-wartość
        Set<Map.Entry<String, String>> entrySet = mapSlownik.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " po angielsku: " + entry.getValue());
        }

        System.out.println("Słownik pl-ang");
        System.out.println("Podaj polskie słowo do wyszukania");
        inputString = scanner.next();

        System.out.println("po angielsku: " + mapSlownik.get(inputString));

    }
}
