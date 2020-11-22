package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    /*
        Plansza 20 kratek
        Każdy gracz ma mieć 3 jednomasztowce z możliwością wyboru lokalizacji
        na początku rozgrywki
        Powinien istnieć gracz CPU, który jest przeciwnikiem dla gracza human
        Gra kończy się kiedy jeden z graczy zbije wszystkie statki przeciwnika
        Plansza nie musi być wyświetlana (dobudowana później)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String player1, player2;
        int mapSize = 20;
        String[] mapPlayer1 = new String[mapSize];
        String[] mapPlayer2 = new String[mapSize];

        mapPlayer1 = mapZeroFilling(mapSize);
        mapPrinting(mapPlayer1, mapSize);
//        boolean test = true;

//        // zerowanie mapy
//        for (int i = 0; i < mapSize; i++) {
//            mapPlayer1[i] = "-";
//            mapPlayer2[i] = "-";
//        }
//
//        System.out.println("Podaj imię dla gracza 1: ");
//        player1 = scanner.next();
//        System.out.println("Podaj imię dla gracza 2 (CPU - wybór gracza komp.): ");
//        player2 = scanner.next();
//
//        int iWhile = 1;
//        int coordinate = 0;
//        System.out.println(player1 + " umieść swoje statki");
//        while (iWhile <= 3) {
//            System.out.println("Podaj położenie " + iWhile + " statku z przedziału 1 do "
//                    + mapSize + ": ");
//            coordinate = scanner.nextInt();
//            if (mapPlayer1[coordinate - 1] == "-") {
//                mapPlayer1[coordinate - 1] = "%";
//                iWhile += 1;
//                System.out.println("Dodano statek");
//            } else {
//                System.out.println("W tym miejscu już jest statek");
//            }
//        }
//
//        System.out.println("");
//
//        iWhile = 1;
//        System.out.println(player2 + " umieść swoje statki");
//        while (iWhile <= 3) {
//            System.out.println("Podaj położenie " + iWhile + " statku z przedziału 1 do "
//                    + mapSize + ": ");
//            coordinate = scanner.nextInt();
//            if (mapPlayer2[coordinate - 1] == "-") {
//                mapPlayer2[coordinate - 1] = "%";
//                iWhile += 1;
//                System.out.println("Dodano statek");
//            } else {
//                System.out.println("W tym miejscu już jest statek");
//            }
//        }
//
//        System.out.println("");
//        System.out.print(player1 + " Twoje statki: "+
//                Arrays.toString(mapPlayer1));
//        System.out.println("");
//        System.out.print(player2 + " Twoje statki: "+
//                Arrays.toString(mapPlayer2));
    }

    static String[] mapZeroFilling(int mapSize) {
        String[]mapPlayer = new String[mapSize];
        for (int i = 0; i < mapSize; i++) {
            mapPlayer[i] = "-";
        }
        return mapPlayer;
    }

    static void mapPrinting(String[] mapPlayer, int mapSize) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < mapSize; i++) {
            System.out.print(mapPlayer[i]);
        }
    }

}
