package com.company.zadania;

public class DogClass {
    private String name;
    private int age;

    public DogClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // wersja 1
//    public void bark(int barkCount) {
//        for (int i = 0; i < barkCount; i++) {
//            if (age <= 5) {
//                System.out.print("hau ");
//            } else if (age <= 10) {
//                System.out.print("grr HAU ");
//            } else {
//                System.out.print("Hauuu ");
//            }
//        }
//        System.out.println("");
//    }

    // wersja 2
    private String bark() {
        String barkkk;
        if (age <= 5) {
            barkkk = "hau ";
        } else if (age <= 10) {
            barkkk = "grr HAU ";
        } else {
            barkkk = "Hauuu ";
        }
        return barkkk;
    }

    public void barkFor(int barkCount) {
        for (int i = 0; i < barkCount; i++) {
            System.out.print(bark());
        }
        System.out.println("");
    }

}
