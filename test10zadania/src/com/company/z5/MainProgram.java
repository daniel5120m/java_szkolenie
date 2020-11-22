package com.company.z5;

import java.util.Scanner;

public class MainProgram {
    private String produktNazwa;
    private String produktKategoria;
    private double produktCena;
    private String menu;

    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("Menu:");
        System.out.println("1 - dodaj nowy produkt");
        System.out.println("2 - wyświetl produkty");
//        System.out.println("3 - edycja danych produktu");
//        System.out.println("4 - usuwanie produktu");
        System.out.println("0 - wyjście");
        System.out.print("Twój wybór: ");
        menu = scanner.next();
    }

    public void mainProductAdd() {
        System.out.print("Podaj nazwę: ");
        produktNazwa = scanner.next();
        System.out.print("Podaj kategorię: ");
        produktKategoria = scanner.next();
        System.out.print("Podaj cenę netto: ");
        produktCena = scanner.nextDouble();
    }

    public String getMenu() {
        return menu;
    }

    public String getProduktNazwa() {
        return produktNazwa;
    }

    public String getProduktKategoria() {
        return produktKategoria;
    }

    public double getProduktCena() {
        return produktCena;
    }


}
