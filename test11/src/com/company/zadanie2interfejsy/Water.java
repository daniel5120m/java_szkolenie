package com.company.zadanie2interfejsy;

public class Water implements Liquid {
    @Override
    public String name() {
        return "Water";
    }

    @Override
    public String smell() {
        return "No smell";
    }

    @Override
    public String taste() {
        return "No taste";
    }

    @Override
    public String look() {
        return "No color";
    }
}
