package com.company;

// import klas z pakietu animals i cars
import com.company.animals.*;
import com.company.cars.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // garbidż kolektor
        /*
            klasa to definicja pewnego rodzaju obiektów, które posiadają określone cechy oraz zachowanie
            (zmienne oraz metody). Jest to element składowy każdej aplikacji zaimplementowanej
            w języku Java

            Definicję każdej klasy umieszczamy w osobnym pliku, który musi nazywać się tak samo
            jak klasa i mieć rozszerzenie java

            Obiekty znajdują się na stercie, które co jakiś czas są odśmiecane (automatyczne zarządzanie
            pamięcią)

            Klasy mogą zawierać:
                - zmienne - można je zadeklarować dowolną liczbę zmiennych, dowolnych typów
                - metody - można zdefiniować dowolną liczbę metod
                - klasę można utworzyć w klasie. Są to klasy wewnętrzne
            Klasy zawsze mają przynajmniej jeden konstruktor

            Obiekty są instancjami klasy
            np. jeśli klasą jest Pies, to instancjami tej klasy będzie Twój pies,
            mój pies i jeszcze pies sąsiada

            Metody przedstawiają zachowania klas
            np. metody przyspiesz(), hamuj()
            Metody mogą przyjmować wartości - nazywane są one argumentami funkcji -
            jak i zwracać dane - typ zwracany funkcji

            Zmienne w klasie i metodzie mogą być zadeklarowane zarówno w klasie jak i metodzie
            Zmienne zadeklarowane w klasie nazywane są polami klasy,
            zmienne zadeklarowane wewnątrz funkcji nazywane są zmiennymi lokalnymi
            Wewnątrz funkcji mamy dostęp do pól klasy, jednak z poziomu klasy lub innej
            funkcji nie mamy dostępu do zmiennych lokalnych

            Konstruktor to fragment kodu klasy uruchamiany w trakcie tworzenia obiektu (instancji)
            tej klasy
            Konstruktor zawsze ma taką samą nazwę jak klasa
            Implementując konstruktor określamy listę argumentów oraz ciało konstruktora
            Ciało konstruktora to ciąg instrukcji, których celem jest zainicjowanie stanu
            nowo tworzonego obiektu

            Słowo kluczowe This
            Jest to słowo, które oznacza referencje do obiektu
            This sprawia, że wartości argumentów konstruktora są przypisywane do pól klasy
            W przeciwnym razie wartość...
            This może być także wykorzystywane do wywołania innego konstruktora

            Modyfikatory dostępu
            public - elementy oznaczone tym modyfikatorem są widoczne dla innych
            komponentów z każdego miejsca (w całym projekcie)
                public int gear;
            protected - widoczne w klasach dziedziczących oraz znajdujących się w tym
            samym pakiecie
                protected int speed;
            none (package) - widoczność pakietowa - elementy nie są widoczne w klasach
            dziedziczących jeżeli znajdują się w innym pakiecie
                int wheelSize;
            private - widoczne są tylko i wyłącznie w klasie w której zostały zdefiniowane
                private int cadence;

            Enkapsulacja - ukrycie fragmentu kodu przed nieautoryzowanymi zmianami

            Interface - zbiór deklaracji metod
            Metoda zadeklarowana to taka, która nie posiada ciała metody, czyli instrukcji
            wewnątrz klamer {...}
            Mówimy, że klasa implementuje dany interfejs jeżeli zawiera implementacje
            wszystkich zawartych w nim metod
            Klasa może implementować jednocześnie kilka różnych interfejsów

            OOP - object oriented programing

            Podstawowe założenia paradygmatu obiektowego
            - abstrakcja - zadeklarowanie klasy jako abstract oznacza, że nie będzie możliwe
            utworzenie żadnej instancji tej klasy
            Klasy abstrakcyjne tworzymy aby je później rozszerzyć przez inną klasę (dziedziczyć
            z nich)
            Metody abstrakcyjne to metody, które nie posiadają implementacji - są oznaczone
            modyfikatorem abstrakt
            Klasa abstrakcyjna nie musi zawierać metod abstrakcyjnych ale jeśli któraś z metod
            w klasie jest abstrakcyjna to automatycznie cała klasa również staje się abstrakcyjna
            i musi być zadeklarowana jako abstract
            - hermetyzacja - oznacza że klasy powinny ukrywać swoje wewnętrzne struktury
            i operacje a udostępniać te dla których zostały powołane, tj. swoje dobrze
            określone interfejsy
            Poprzez nieujawnienie tych szczegółów chcemy zagwarantować, że sposób implementacji
            będzie można w przyszłości zmienić bez konieczności modyfikacji innych klas
            W Javie hermetyzację osiągamy poprzez odpowiednie stosowanie modyfikatorów dostępu
            w miarę możliwości jak najbardziej restrykcyjnie
            Przejawem dążenia do wysokiej hermetyzacji jest oznaczenie wszystkich zmiennych
            instancyjnych jako prywatne i udostępnianie ich na zewnątrz poprzez metody typu
            get i set
            - polimorfizm - wielopostaciowość oznacza możliwość traktowania obiektów różnych podtypów
            pewnego wspólnego typu w taki sam sposób (typy zgodne pod względem przypisania)
            Wszelkiego rodzaju zmiany typów, zarówno jawne jak i niejawne, statyczne i dynamiczne,
            również należy uznać za mechanizmy polimorficzne, gdyż pozwalają traktować wartości
            i zmienne jednego typu, tak jakby były wartościami innego typu
            - dziedziczenie - polega na przejmowaniu przez jedną klasę metod i zmiennych innej klasy
            Override - przesłonięcie metody
            Overload - pisanie metody o tej samej nazwie z inną listą parametrów (nie można zrobić przesłaniania
            z taką samą nazwą, listą argumentów a zwracany inny typ danych)

            ALT + INS - tworzenie konstruktora
            ALT + ENTER - przesłanianie
         */


        String s = new String();

        // obiekt stworzony operatorem new
        Dog burek = new Dog("Burek");
        Dog kobol = new Dog("Kobol");
        Dog frodo = new Dog("Frodo");
        Dog cosmicDog = new Dog("Space Cowboy", 7);

        // sprawdzenie czy zmienna referencyjna burek i kobol wskazują na ten sam obiekt
        System.out.println(burek.getClass() == kobol.getClass());

//        burek.name = "Burek";
//        kobol.name = "Kobol";
//        frodo.name = "Frodo";

        System.out.println("Przedstaw się piesku: ");


//        burek.numberOfPaws = 4;
//        kobol.numberOfPaws = 4;

        System.out.println("Mam: " + burek.getNumberOfPawn());
        System.out.println("Mam: " + kobol.getNumberOfPawn());

        burek.introduce();
        kobol.introduce();

        List<Dog> dogList = new ArrayList<>();
        dogList.add(burek);
        dogList.add(kobol);
        dogList.add(frodo);
        dogList.add(cosmicDog);

        System.out.println("Test...");
        for (int i = 0; i < dogList.size(); i++) {
            dogList.get(i).introduce();
        }

        System.out.println("Klasa samochody...");
        Car porsche = new Car(200);
        Car polonez = new Car(0);
        Car ferrari = new Car(320);

        List<Car> cars = new ArrayList<>();
        cars.add(porsche);
        cars.add(polonez);
        cars.add(ferrari);

        for (Car c: cars) {
            System.out.println(c.speed);
        }

        porsche.hamuj();
        ferrari.przyspiesz();

        for (Car c: cars) {
            System.out.println(c.speed);
        }

    }

}
