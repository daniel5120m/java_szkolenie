package com.company;

import java.util.*;

public class ListyZadanie2 {
    public static void main(String[] args) {
        /*
            napisać metodę która dla danej listy zwraca nową posortowaną listę

         */

        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        int integerArrayListSize = 10;

        while (integerArrayList.size() < integerArrayListSize) {
            integerArrayList.add(random.nextInt(99) + 1);
        }

        System.out.println("ArrayList: " + integerArrayList);
        System.out.println("Posortowana: " + sort(integerArrayList));

    }

    static List<Integer> sort(ArrayList<Integer> integerArrayList) {
        List<Integer> tmp = new ArrayList<>(integerArrayList);
        Collections.sort(tmp);
        return tmp;
    }

}
