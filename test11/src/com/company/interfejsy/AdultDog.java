package com.company.interfejsy;

public class AdultDog implements Dog {
    @Override
    public String bark() {
        return "grrr Hau";
    }

    @Override
    public int getBarkCount() {
        return 3;
    }
}
