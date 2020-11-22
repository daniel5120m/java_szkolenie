package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //agenda

        //if
        int int1A = 5;
        int int1B = 7;
        if(int1A > int1B) {
            System.out.println(int1A + " > " + int1B);
        }
        else {
            System.out.println(int1A + " < " + int1B);
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("podaj ile masz lat");
        int wiek2 = scanner2.nextInt();
        if(wiek2>=18) {
            System.out.println("uuu wchodz na disko");
        } else if(wiek2<0){
            System.out.println("nie klam");
        } else {
            System.out.println("gdzie z butami");
        }

    }
}
