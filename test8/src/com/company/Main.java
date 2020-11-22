package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // kolekcje (array list) - wszystkie klasy implementujące interfejs Collection
        // kolekcje reprezentują grupy obiektów
        /*
            Listy - klasy implementujące interfejs List, używane tam, gdzie
            interesuje nas kolejność obiektów. Elementy mogą się powtarzać
            Zbiory - klasy implementujące interfejs Set. Charakteryzują się tym,
            że nie mogą zawierać duplikatów
            Kolejki - klasy implementujące interfejs Queue. Służą do przechowywania
            elementów, które powinny być przetwarzane kolejno, zgodnie z pewnym
            porządkiem (np. FIFO)
         */

        /*
            Listy (każdy element ma przyporządkowany numer (indeks)

         */

        // ArrayList są wydajniejsze do odczytu
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        String nameOfBolek = "Bolek";

        System.out.println("Lista jest pusta? " + stringArrayList.isEmpty());
        stringArrayList.add(nameOfBolek);
        System.out.println("Lista jest pusta? " + stringArrayList.isEmpty());
        stringArrayList.add("Lolek");

        System.out.println("Rozmiar listy: " + stringArrayList.size());
        System.out.println("index 0: " + stringArrayList.get(0));
        System.out.println("index 1: " + stringArrayList.get(1));
        // nie pójdzie ponieważ nie ma wpisu pod indeksem 2
//        System.out.println("index 1: " + stringArrayList.get(2));

        stringArrayList.add(1, "Wacek");
        System.out.println("index 1: " + stringArrayList.get(1));
        // przeciążanie
        stringArrayList.remove("Wacek"); // usuwa pierwsze wystąpienie
        System.out.println(stringArrayList);

        // LinkedList są wydajniejsze do modyfikacji
        LinkedList<String> stringLinkedList = new LinkedList<>();


        // mapy - klasy implementujące interfejs Map
        // mapy reprezentują związki obiektów z pewnymi kluczami, które identyfikują
        // te obiekty
        /*
            podstawowe operacje:
            put(K key, V value) - dodawanie elementu do mapy
            V get(K key) - pobranie elementu z mapy

            najpopularniejsze implementacje:
            HashMap - podstawowa implementacja
            TreeMap - elementy są przechowywane w formie posortowanej (wg klucza)
         */
        // HashMap
        System.out.println("");
        // Map<String, Integer> ... - indeksem będzie string, wartością integer
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("pierwszy", 1);
        mapa.put("drugi", 2);
        mapa.put("trzeci", 3);

        System.out.println("pierwszy: " + mapa.get("pierwszy"));
        System.out.println("null: " + mapa.get(null));
        mapa.put(null, 13);
        System.out.println("null: " + mapa.get(null));

        System.out.println("");

        /*
            napisz metodę, która dla danej listy zwróci nową listę
            elementów podzielonych przez 3
         */
        Random random = new Random();
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        ArrayList<Double> doubleArrayList1 = new ArrayList<>();
        int i = 0;
        int arraySize = 10;
        while (integerArrayList1.size() < arraySize) {
            integerArrayList1.add(random.nextInt(49) + 1);
            doubleArrayList1.add(integerArrayList1.get(i) / 3.0);
            i++;
        }
        System.out.println(integerArrayList1);
        System.out.println(doubleArrayList1);

    }
}
