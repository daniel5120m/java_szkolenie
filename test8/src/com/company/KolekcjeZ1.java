package com.company;

import java.util.*;

public class KolekcjeZ1 {
    public static void main(String[] args) {
        /*
            wykonać losowanie liczb dużego lotka bez powtórzeń
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> integerSet = new HashSet<>();
        int los;
        while (integerSet.size() <6) {
            integerSet.add(random.nextInt(49)+1);
        }
        System.out.println(integerSet);
    }


}
