package com.company;

public class Main {

    // public static
    // metoda statyczna
    public static void main(String[] args) {
        // metody
        /* definicja
        typ zwracany i argumenty metod
        wywoływanie metod
        funkcje rekurencyjne i przesłałanieni metod
         */

        // metoda zwana inaczej funkcją jest to blok kodu,
        // który wykonuje jakieś operacje i zazwyczaj zwraca wynik
        // System.out.printld należy do logiki prezentacji
        // a+b należy do logiki biznesowej

        /*
        budowa
        <modyfikator dostępu> <typ zwracany> nazwa funkcji(<typ argumentu> <nazwa argumentu>
         */

        // varargs
        // może przyjąć dowolną ilość argumentów
        /* np. private static void printAllElements(String... elements) {
        for (String e : elements) {
            System.out.println(e);
        }
        */
        // varargs musi być ostatni na liście argumentów
        // np ...(int a, String... elements) {

        // overloading
        // https://beginnersbook.com/2013/05/method-overloading/

        // metody private zaleca się pisać na końcu

        System.out.println("metody...");


        int a = 5;
        int b = 6;
        // wywołanie 2 metod
        print(calculateSum(a, b));

        a = 100;
        b = 200;
        print(calculateSum(a, b));

        // write your code here
    }

    // metoda caclulateSum
    static int calculateSum(int a, int b) {
        return a + b;
    }

    // metoda print
    static void print(int result) {
        System.out.println(result);
    }

}
