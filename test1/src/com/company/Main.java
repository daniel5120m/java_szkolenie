package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // zmienne
        // z malych liter typy proste
        // całkowite
        int zmienna = 42;
        int a = 5;
        // ciag znakow jest tylko zlozonym typem
        String s = "Ala ma kota";
        // rzeczywista
        float f = 1.3f;
        // rzeczywista, double jest domyslna dla javy
        double d = 4.679;
        // znakowa
        char c = 'a';
        // logiczna
        boolean b = true;

        // z duzych liter typy zlozone - obiektowe
        Integer zmienna1 = 42;
        Float f1 = null;  // dla typu obiektowego mozna przypisac null
        Double d1 = 4.679;
        // dla typu zlozonego Boolean mozna takze przypisac null
        Boolean b1 = true;

        // typy floatingowe nie zachowuja precyzji


        // wyswietlanie Hello world
        System.out.println("Hello world");
        // sprawdzenie maksymalnych i minimalnych wartosci
        System.out.println(Long.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);

        // wyswietlenie wartosci zmiennych
        System.out.println(zmienna);
        System.out.println(a);
        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

        System.out.println("\nHello world");

        // zmienne finalne - mozemy przypisac wartosc tylko raz
        // np.
//        final String myFinalString = "Pies";
//        myFinalString = "Kot";  // nie mozna juz zmienic wartosci

        System.out.println("\noperacje na zmiennych");
        // operacje na zmiennych
        // operator przypisania np. zmienna = 9;
        int y = 5;
        double z = 0.1;
        y = 9 + 89;  // dodawanie
        y = 9 / 89;  // dzielenie calkowite (bez ulamkow)
//        y = 9 / 89.0;  // dzielic przez calkowite na int juz nie mozna
//        y = 9 / z;  // j/w
//        z = 9;
//        y = 9 / z;
        float fl = 4/4.0f;  // domyslny typem jest double dlatego trzeba dodac f
//        float fl1 = 4/4.0;  // nie skompiluje sie, domyslny typ double
        int y1 = (int) (4/4.0);  // odciecie czesci ulamkowej i zapisanie wyniku jako int
        System.out.println(y1);
        int y2 = (int) (4/7);
        System.out.println(y2);
        // byte jest mniejszym typem dlatego nie wsadzi sie tam inta
        // sprawdzane sa typy danych a nie wielkosc podstawiona
//        byte b2 = 4 + y1;

        System.out.println("\npromocja numeryczna");
        // promocja numeryczna - typy sa automatycznie promowane do inta i na indach
        // robione sa dzialania
        byte bb1 = 7;
        byte bb2 = 9;
//        byte bb3 = bb1 + bb2;  //nie zadziala
        byte bb3 = (byte)(bb1 + bb2);
        System.out.println(bb3);
        // jezeli cos jest wieksze niz int, promowanie jest do wiekszego typu,
        // jezeli cos jest mniejsze niz int, automatycznie promuje do int
        short sh1 = 7;
        short sh2 = 9;
//        short sh3 = sh1 + sh2;  // automatyczne promowanie do int - nie zadziala
        short sh3 = (short)(sh1 + sh2);
        System.out.println(sh3);

        System.out.println("\noperatory skrocone");
        // operatory skrocone
        int inta = 9;
        inta += 5;  // to samo co -> inta = inta + 5;
        System.out.println(inta);
        // inta %= 5; inta -= 5; itp

        inta = 9;
        inta++;  // postinkrementacja - zczytanie wartosci a nast. dodanie 1
        System.out.println(inta);
        inta = 9;
        ++inta;  // preinkrementacja - zwiekszenie zmiennej a nastenie zaczytanie
        System.out.println(inta);
        System.out.println(inta++);

        System.out.println("\nkonkatenacja");
        // konkatenacja
        String ala = "Ala";
        String ma = "ma";
        String konia = "konia";
        System.out.println(ala+ma+konia);
        String spacja = " ";
        System.out.println(ala+spacja+ma+spacja+konia);
        System.out.println(ala+spacja+ma+spacja+konia+" \ni kota ale kota lubi mniej");
        System.out.println("1"+2);
        System.out.println("1" + 2 + 2);  // liczby 2 zostanie przeciazona do stringa
        System.out.println("1" + (2 + 2));  // liczby 2 zostana obliczone a wynik przec. do str.
        System.out.println(2 + 2 + "1");
        System.out.println((2 + 2) + "1");

        System.out.println("\noperatory");
        // operatory
        // kolejnosc wykonywania operacji jest zgodna z C++
        // podwojny and i or sa operatorami krotkiego spiecia
        // czyli jezeli mamy wyrazenie logiczne, java nie sprawdzi wyrazenia logicznego
        // jezeli jest pojedynczy and i pojedynczy or - java sprawdza wyrazenia logiczne
        // kolejnosc operatorow logicznych: negacja, koniunkcja, alternatywa
        int intb = 9;
        boolean bol1 = true;
        System.out.println(bol1);
        System.out.println(!bol1);
        System.out.println(false&&bol1);
        System.out.println(false&bol1);
        System.out.println(!(false&&bol1));

    }
}
