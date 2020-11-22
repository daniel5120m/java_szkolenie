package com.company;

import java.util.ArrayList;

public class ListyZadanie1 {
    public static void main(String[] args) {
        /* w klasie testowej należty utworzyć listę elementów typu string,
         zaimplementować metodę, którea będzie sprawdzać czy występują
         niej powtarzające się elementy
         */

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("zielony");
        stringArrayList.add("niebieski");
        stringArrayList.add("czerwony");
        stringArrayList.add("niebieski");
        stringArrayList.add("żółty");
        stringArrayList.add("czerwony");

        System.out.println("wielkość listy: " + stringArrayList.size());
        System.out.println("zawartość: " + stringArrayList);
        System.out.println("Ile duplikatów? " + listCheck(stringArrayList));

    }

    static int listCheck(ArrayList<String> stringArrayList) {
        int potworzenia = 0;
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (stringArrayList.indexOf(stringArrayList.get(i)) != i) {
                potworzenia += 1;
            }
        }
        return potworzenia;
    }

}
