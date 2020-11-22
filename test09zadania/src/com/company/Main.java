package com.company;

import com.company.Worker;
import com.company.Mem;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Worker inf01 = new Worker("Daniel", "Mierzejewski", 5000, 37);
        Worker inf02 = new Worker("Marian", "Niewachlowski", 3000, 25);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(inf01);
        workerList.add(inf02);

        for (int i = 0; i < workerList.size(); i++) {
            System.out.println("Imię pracownika: " + workerList.get(i).getName());
            System.out.println("Nazwisko pracownika: " + workerList.get(i).getSurname());
            System.out.println("Miesięczna pensja: " + workerList.get(i).getSallaryMonth());
            System.out.println("Roczna pensja: " + workerList.get(i).getSallaryYear());
            System.out.println("Wiek: " + workerList.get(i).getAge());
        }

        List<Mem> memsy = new ArrayList<>();
        memsy.add(new Mem("pierwszy", "https://blabla.png", "opis pierwszego", 3.5));
        memsy.add(new Mem("drugi", "ftp://ummm.jpg", "opis drug", 5.7));
        memsy.add(new Mem("trzeci", "https://haaaa.jpg", "opis trze", 9.0));
        memsy.add(new Mem("czwarty", "https://bnmbnm.jpg", "opis czwa", 9.1));
        memsy.add(new Mem("piąty", "https://plapla.jpg", "opis piat", -2.1));

        System.out.println("Memy...");
        for (Mem mm : memsy) {
            System.out.println("Nazwa: " + mm.getName());
            System.out.println("URL: " + mm.getUrlPicture());
            System.out.println("Opis: " + mm.getDescription());
            System.out.println("Średnia ocen: " + mm.getAvgOpinion());
        }


    }
}
