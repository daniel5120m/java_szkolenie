package com.company;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        int[] t1 = new int[5];
        // poniższy wpis nie przejdzie w metodzie przy przekazywaniu parametrów
        int[] t2 = {1, 2, 3, 4, 5, 6};
        // a ten już przejdzie
        int[] t3 = new int[]{1, 2, 3, 4};

//        t4(new int[]{1,2,3,4});
//        public static void t4 ( int[] tab){
//
//        }
        int[] t5 = new int[]{1, 2, 3, 4, 5} ;
        System.out.print("Wilkość tablicy: " + t5.length + "\n");
        System.out.print("Suma wartości tablicy: " + Arrays.stream(t5).sum() + "\n");
        String[] ot1 = {"1", "2", "3"};
        // zmienna iteracyjna string i pętla for-each
        for (String string : ot1) {
            System.out.print("bla");
        }
    }
}
