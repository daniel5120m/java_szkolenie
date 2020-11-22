package com.company.interfejsy;

public class YoungDog implements Dog {
    @Override
    public String bark() {
        return "hau";
    }

    @Override
    public int getBarkCount() {
        return 5;
    }
}
