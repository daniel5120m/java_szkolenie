package com.company;

public class AgeWithArrays {
    public static void main(String[] args) {
        int motherAge = 28;
        int fatherAge = 27;
        int[] ages = {motherAge, fatherAge};
        int ageSum = 0;
        // pętla for-each nie ma możliwości dostania się do konkretych indeksów
        for (int age : ages) {
            ageSum += age;
        }
        // metoda lenght zwraca wielkość tablicy
        double average = (double) ageSum / ages.length;
        System.out.print(average);
        int max = ages[0];
        int min = ages[0]; //Integer.MAX_VALUE
        for (int age : ages) {

        }
//        int max = Math.max(motherAge, fatherAge);
//        int min = Math.min(motherAge, fatherAge);
    }
}
