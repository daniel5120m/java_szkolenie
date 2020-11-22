package com.company.zadanieSamoloty;

import com.company.pliki.Planet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class RunClass {
    public static void main(String[] args) throws IOException {
        // definicja obsługi nowego pliku z wykorzystaniem interfejsu Path i klasy Paths
        Path planePath = Paths.get("src/com/company/zadanieSamoloty/samoloty.txt");

        System.out.print("Sprawdzam istnienie pliku: ");
        // klasa Files umożliwia wykonywanie operacji na plikach
        System.out.println(Files.exists(planePath));
        System.out.print("Podaj rozmiar pliku: ");
        // metoda size zwraca wielkośc pliku w bajtach
        System.out.println(Files.size(planePath));
        System.out.print("Zawartość pliku: ");
        System.out.println(Files.readAllLines(planePath));

        if (!Files.exists(planePath)) {
            System.out.println("Plik " + planePath + " nie istnieje, tworzę...");
            Files.createFile(planePath);
        } else {
            System.out.println("Plik " + planePath + " istnieje, usuwam go...");
            Files.deleteIfExists(planePath);
            System.out.println("Tworzę na nowo " + planePath);
            Files.createFile(planePath);
        }

        List<Plane> planeList = new ArrayList<>();

        Plane plane1 = new Plane("Boeing", "blue", "765", "ładuje duuużo ludzi");
        Plane plane2 = new Plane("Airbus", "red", "765", "ładuje duuużo ludzi");
        Plane plane3 = new Plane("Bombardier", "green", "450", "ładuje mniej ludzi");

        planeList.add(plane1);
        planeList.add(plane2);
        planeList.add(plane3);

        for (Plane p : planeList) {
            Files.write(planePath, p.toSaveString().getBytes(), StandardOpenOption.APPEND);
            Files.write(planePath, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
        }

        System.out.print("Sprawdzam istnienie pliku: ");
        // klasa Files umożliwia wykonywanie operacji na plikach
        System.out.println(Files.exists(planePath));
        System.out.print("Podaj rozmiar pliku: ");
        // metoda size zwraca wielkośc pliku w bajtach
        System.out.println(Files.size(planePath));
        System.out.print("Zawartość pliku: ");
        System.out.println(Files.readAllLines(planePath));


    }
}
