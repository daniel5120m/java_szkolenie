package com.company.zadanie2interfejsy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Liquid water = liquidModule("water");
        Liquid juice = liquidModule("juice");
        Liquid acid = liquidModule("acid");

        List<Liquid> liquids = new ArrayList<>();

        liquids.add(water);
        liquids.add(juice);
        liquids.add(acid);

        for (Liquid liquid : liquids) {
            System.out.println(liquid);
            System.out.println("Typ cieczy: " + liquid.name() + ". Zapach: " + liquid.smell() +
                    ". Smak: " + liquid.taste() + ". Wygląd: " + liquid.look());
        }

        int randomNumber = random.nextInt(liquids.size())+1;
        Liquid liquid = liquids.get(randomNumber);
            System.out.println("Typ cieczy: " + liquid.name() + ". Zapach: " + liquid.smell() +
                        ". Smak: " + liquid.taste() + ". Wygląd: " + liquid.look());

    }

    private static Liquid liquidModule(String liquid) {
        if (liquid == "water") {
            return new Water();
        } else if (liquid == "juice") {
            return new Juice();
        } else if (liquid == "acid") {
            return new Acid();
        }
        return null;
    }
}