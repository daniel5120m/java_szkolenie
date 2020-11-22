package com.company.zadanie2interfejsy;

public class Acid implements Liquid {
    @Override
    public String name() {
        return "Acid";
    }

    @Override
    public String smell() {
        return "Oh, my butterfly's leg. It's stinky";
    }

    @Override
    public String taste() {
        return "You hurt yourself";
    }

    @Override
    public String look() {
        return "It's green. Nice color";
    }
}
