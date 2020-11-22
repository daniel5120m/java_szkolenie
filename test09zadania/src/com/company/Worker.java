package com.company;

public class Worker {

    /*
        stworzyć klasę pracownik, która przechowuje następujące informacje
        imię
        nazwisko
        pensja miesięczna
        wiek
        imię i nazwisko musi mieć minimum 5 liter i zaczynać się od dużej litery
        stworzyć metodę, która zwraca pensję roczną pracownika
     */
    private String name;
    private String surname;
    private int sallaryMontly;
    private int age;

    private Worker() {

    }

    Worker(String name, String surname, int sallaryMontly, int age) {
        if (checkStr(name)) {
            this.name = name;
        } else {
            this.name = "Error";
        }
        if (checkStr(surname)) {
            this.surname = surname;
        } else {
            this.surname = "Error";
        }
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        if (sallaryMontly >= 0) {
            this.sallaryMontly = sallaryMontly;
        } else {
            this.sallaryMontly = 0;
        }
    }

    private boolean checkStr(String str) {
        return str.length() >= 5 && str.toUpperCase().charAt(0) == str.charAt(0);
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSallaryMonth() {
        return sallaryMontly;
    }

    public int getSallaryYear() {
        return sallaryMontly * 12;
    }

    public int getAge() {
        return age;
    }
}
