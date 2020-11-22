package com.company;

public abstract class AbstractClass {
    private int a;

    public abstract String abstractMethod(int a);

    public String notAbstractMethod(int b) {
        a = b;
        return "b";
    }


}
