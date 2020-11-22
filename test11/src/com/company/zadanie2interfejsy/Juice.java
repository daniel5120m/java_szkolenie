package com.company.zadanie2interfejsy;

public class Juice implements Liquid {
    @Override
    public String name() {
        return "Juice";
    }

    @Override
    public String smell() {
        return "Like fresh morning";
    }

    @Override
    public String taste() {
        return "Like peaches";
    }

    @Override
    public String look() {
        return "It's orange";
    }
}
