package com.company.zadania;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // zadanie 1
        // obiekt stworzony na stercie a referencja na stosie
        Car panda = new Car("Fiat", "Panda", 500.15);
        Car fiat = new Car("Fiat", "Panda", 500.15);
        Car bmw = new Car("BMW", "X6", 100.0);

        System.out.println(panda.getBrand() + " " + panda.getModel() + " " + panda.getPrice());
        System.out.println(fiat.getBrand() + " " + fiat.getModel() + " " + fiat.getPrice());
        System.out.println(bmw.getBrand() + " " + bmw.getModel() + " " + bmw.getPrice());

        // zadanie 2
        Person mierzej = new Person("Daniel", "Mierzejewski", 18);
        System.out.println(mierzej.getName() + " " + mierzej.getSurname() + " " + mierzej.getAge());

        // zadanie 3*
        List<Formula1> monako = new ArrayList<>();
        Formula1 kubica = new Formula1("Renault", "Kubica");
        Formula1 szumacher = new Formula1("Ferrari", "Szumacher");
        monako.add(kubica);
        monako.add(szumacher);

        for (Formula1 f : monako) {
            System.out.println(f.toString());
        }

        for (int i = 0; i < monako.size(); i++) {
            System.out.println(monako.stream());
        }

        // zadanie 4
        com.company.zadania.DogClass burek = new com.company.zadania.DogClass("Burek", 8);
        com.company.zadania.DogClass pipi = new com.company.zadania.DogClass("Pipi", 1);
        com.company.zadania.DogClass reksio = new com.company.zadania.DogClass("Reksio", 12);

        burek.barkFor(2);
        pipi.barkFor(5);
        reksio.barkFor(1);

        // zadanie 6
        System.out.println("");
        System.out.println("zadanie 6");
        Glass glass = new Glass(0, 500);
        glass.printWaterM1();
        glass.fill(100);
        glass.printWaterM1();
        glass.gulp();
        glass.printWaterM1();
//        glass.pourOut();

        glass.fill(100);
        glass.printWaterM1();
        glass.gulp();
        glass.printWaterM1();
        glass.gulp();
        glass.printWaterM1();
        glass.gulp();
        glass.printWaterM1();
        glass.gulp();
        glass.printWaterM1();

        glass.fill(100);
        glass.printWaterM1();
        glass.fill(100);
        glass.printWaterM1();
        glass.fill(100);
        glass.printWaterM1();
        glass.fill(100);
        glass.printWaterM1();
        glass.fill(100);
        glass.printWaterM1();
        glass.fill(100);
        glass.printWaterM1();
    }
}
