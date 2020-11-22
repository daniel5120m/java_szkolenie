package com.company.interfejsy;

public class Test {
    public static void main(String[] args) {

        Dog dog = DogModule();
        pringBraking(dog);

    }

    private static Dog DogModule() {
        return new AdultDog();
    }

    private static void pringBraking(Dog dog) {
        int barkCount = dog.getBarkCount();
        for (int i = 0; i < barkCount; i++) {
            System.out.print(dog.bark() + " ");
        }
    }
}
