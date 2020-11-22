package com.company;

import java.util.*;

public class KolekcjeZ2 {
    public static void main(String[] args) {
        /*
            ma odczytywać n liczb i wypisywać liczbę wystąpień danej liczby
            np.
            1 2 4 4 4 3 3
            1 wyst. 1 raz
            2 wyst. 1 raz
            3 wyst. 2 razy
            4 wyst. 3 razy
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int listaIlosc = 10;

        List<Integer> integerList = new ArrayList<>();
        while (integerList.size() < listaIlosc ) {
            integerList.add(random.nextInt(9)+1);

        }

        System.out.println(integerList);
//        for (Map.Entry<Integer, Integer> pair : numbers.entrySet()) {
//            System.out.println("Liczba" + pair.getKey() + "wystepuje" + pair.getValue());
//        }
//        for(Integer key : ubers.keySet()) {
//            System.out.println("Liczba: " + key + "Częstotliwość:" + numbers.get(key));
//        }

    }


}
