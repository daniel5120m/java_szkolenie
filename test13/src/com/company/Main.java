package com.company;

import com.company.pliki.Planet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

// skróty klawiszowe
// SHIFT + ALT + INSERT - przejście w trym edycji wieloliniowej - wł/wył tryb


public class Main {

    public static void main(String[] args) throws IOException {
        // porównanie
        System.out.println("10 == 10: " + (10 == 10));
        System.out.println("10 != 10: " + (10 != 10));
        System.out.println("true == true: " + (true == true));
        System.out.println("true != true: " + (true != true));
        System.out.println("a == a: " + ('a' == 'a'));
        System.out.println("'a' != 'a': " + ('a' != 'a'));
        System.out.println("500L == 500L: " + (500L == 500L));
        System.out.println("500L != 500L: " + (500L != 500L));
        System.out.println("0.3 == 0.1 + 02:" + (0.3 == 0.1 + 0.2));
        System.out.println(0.1 + 0.2);
        // dwa różne obiekty na stercie dlatego test == test zwróci false
        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + (new String("test").equals(new String("test"))));

        // metoda equals powinmna być
        // 1. zwrotna object.equals(object) == true;
        // 2. symetryczna x.equals(y) == true && y.equals(x);
        // 3. przechodnia x,y,z x.euqals(y) == true && y.equals(z) == true && x.equals(z) == true;
        // 4. spójna

        Chair chair1 = new Chair("Adde", "Ikea", 2016);
        Chair chair2 = new Chair("Janinge", "Ikea", 2016);
        Chair chair3 = new Chair("Adde", "Ikea", 2016);
        Chair chair4 = new Chair("Adde", "Ikea", 2016);

        System.out.println("chair1.equals(chair2): " + chair1.equals(chair2));
        System.out.println("chair1.equals(chair3): " + chair1.equals(chair3));
        System.out.println("chair1.equals(chair4): " + chair1.equals(chair4));
        System.out.println("chair3.equals(chair1): " + chair3.equals(chair1));
        System.out.println("chair2.equals(chair2): " + chair2.equals(chair2));
        System.out.println("chair2.equals(chair4): " + chair2.equals(chair4));

        Human human1 = new Human("Daniel", "Mierzejewski", 37);
        Human human2 = new Human("Daniel", "Mierzejewski", 35);

        System.out.println("human1.equals(human2: " + human1.equals(human2));

        // wyjątki - w języku java to obiekt, który opisuje pewną sytuację błędną
        // lub nieprawidłową - wyjątkową
        // jest to obiekt odpowiedniego typu, tj. obiekt klasy Throwable lub jej dowolnej podklasy
        // wyjątki dzielą się na dwa rodzaje: kontrolowane i niekontrolowane
        // kontrolowane to takie, które musimy deklarować i obsługiwać
        // niekontrolowane także możemy obsługiwać


        // obsługa plików

        // definicja obsługi nowego pliku z wykorzystaniem interfejsu Path i klasy Paths
        Path planetsPath = Paths.get("src/com/company/pliki/planety.txt");

        System.out.print("Sprawdzam istnienie pliku: ");
        // klasa Files umożliwia wykonywanie operacji na plikach
        System.out.println(Files.exists(planetsPath));
        System.out.print("Podaj rozmiar pliku: ");
        // metoda size zwraca wielkośc pliku w bajtach
        System.out.println(Files.size(planetsPath));
        System.out.print("Zawartość pliku: ");
        System.out.println(Files.readAllLines(planetsPath));

        // tworzenie kolekcji lines, która zczyta zawartość pliku z planetsPath
        // metoda readAllLines zczytuje zawartość pliku linia po linii
        // każdy string w kolekcji będzie osobną linią
        // List zachowuje kolejność zczytywanych danych z pliku i umożliwia używanie duplikatów
        List<String> lines = Files.readAllLines(planetsPath);
        List<Planet> planetList = new ArrayList<>();
        for (String line : lines) {
            System.out.println(line);
            // tworzenie tablicy, której kolumny zostaną określone na podstawie podziału ze znakiem ;
            String[] arr = line.split(";");
            String name = arr[0];
            String mass = arr[1];
            String distanceToSun = arr[2];
            planetList.add(new Planet(name, mass, distanceToSun));
        }


        // wyświetlenie kolekcji
        System.out.println();
        System.out.println("Wyświetlenie zawartości kolekcji utworzonej z pliku");
        for (Planet p : planetList) {
            System.out.println(p);
        }


        // zapis do pliku
        System.out.println();
        System.out.println("Zapis do pliku");
        Path savePath = Paths.get("src/com/company/pliki/planety_save.txt");
        System.out.print("Sprawdzam czy istnieje plik: ");
        System.out.println(Files.exists(savePath));

        if (!Files.exists(savePath)) {
            System.out.println("Plik " + savePath + " nie istnieje, tworzę...");
            Files.createFile(savePath);
        } else {
            System.out.println("Plik " + savePath + " istnieje, usuwam go...");
            Files.deleteIfExists(savePath);
            System.out.println("Tworzę na nowo " + savePath);
            Files.createFile(savePath);
        }

//        Files.write(savePath, "test123".getBytes(), StandardOpenOption.CREATE);
//        Files.write(savePath, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
//        Files.write(savePath, "test456".getBytes(), StandardOpenOption.APPEND);
//        Files.write(savePath, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
//        Files.write(savePath, "bla bla bla".getBytes(), StandardOpenOption.APPEND);
//        System.out.print("Sprawdzam czy istnieje plik: ");
//        System.out.println(Files.exists(savePath));
        for (Planet p : planetList) {
            Files.write(savePath, p.toString().getBytes(), StandardOpenOption.APPEND);
            Files.write(savePath, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
        }

    }
}
