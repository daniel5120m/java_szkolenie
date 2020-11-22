package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
/*
        // zadanie 2
        System.out.println("zadanie 2");

        System.out.println("Podaj wyraz do sprawdzenia");
        String z2string = scanner.next();
        System.out.println("Podany wyraz: " + z2string);
        System.out.println("Podaj od którego znaku chcesz wyświetlić ciąg (zakres 0 - "+(z2string.length()-1)+")");
        int z2int = scanner.nextInt();
        if(z2int >= 0 && z2int < z2string.length()-1) {
            System.out.println("Tekst: "+z2string.substring(z2int));
        } else {
            System.out.println("Podano złą wartość");
        }
*/
/*
        // zadanie 3
        System.out.println("\nzadanie 3");
        System.out.println("Podaj ciąg znaków");
        String z3string = scanner.next();
        if(z3string.charAt(z3string.length()-1) == 'M' || z3string.charAt(z3string.length()-1) == 'm') {
            System.out.println("Ostatnia litera to M lub m: " + (z3string.charAt(z3string.length()-1)));
        }
*/
/*
        // zadanie 4
        // sprawdzenie czy pierwszy znak jest cyfrą
        System.out.println("\nzdanie 4");
        System.out.println("Podaj ciąg znaków");
        String z4string = scanner.next();
        System.out.println(Character.isDigit(z4string.charAt(0)));
*/
/*
        // zadanie 5
        // sprawdzenie czy pierwszy znak jest taki sam jak ostatni
        System.out.println("\nzdanie 5");
        String z5string = scanner.next();
        System.out.println(z5string);
        if(z5string.charAt(0) == z5string.charAt(z5string.length()-1)) {
            System.out.println(z5string.charAt(0) + " = " + (z5string.charAt(z5string.length()-1)));
        } else {
            System.out.println(z5string.charAt(0) + " <> " + (z5string.charAt(z5string.length()-1)));
        }
*/
/*
        // zadanie 7
        System.out.println("zadanie 7");
        System.out.println("\"Mowa jest srebrem, a milczenie złotem\"");
*/
/*
        // zadanie 8
        // porównanie 2 stringów wczytanych
        System.out.println("zadanie 8");
        String z8string1 = scanner.next();
        String z8string2 = scanner.next();
        System.out.println(z8string1.equals(z8string2));
*/
/*
        // zadanie X1
        // określ czy podany ciąg zawiera słowo "kot"
        System.out.println("zadanie X1");
        String zX1string = scanner.nextLine();
        System.out.println("zX1string zawiera słowo kot? " + zX1string.contains("kot"));
*/
/*
        // zadanie X2
        // odczytaj wyraz i zamień * pustym ciągiem znaków
        // np. a*bcd program zwróci abcd
        System.out.println("zadanie X2");
        String zX2string = scanner.nextLine();
        System.out.println(zX2string);
        System.out.println(zX2string.replace("*", ""));
*/
/*
        // zadanie X3
        // odczytać wyraz i zwrócić true lub false jeżeli wyraz kończy się na "tka"
        System.out.println("zadanie X3");
        String zX3string = scanner.nextLine();
        if( "tka".equals(zX3string.substring(zX3string.length()-3))) {
            System.out.println("kończy się na tka");
            System.out.println(zX3string.substring(zX3string.length()-3));
        } else {
            System.out.println("NIE kończy się na tka");
            System.out.println(zX3string.substring(zX3string.length()-3));
        }
*/
/*
        String xxx = "Helllllooooo";
        System.out.println(xxx.);
*/


    }
}
