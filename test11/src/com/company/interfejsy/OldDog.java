package com.company.interfejsy;

public class OldDog implements Dog {
    @Override
    public String bark() {
        return "Hauuuu";
    }

    @Override
    public int getBarkCount() {
        return 1;
    }
}
