package com.company.enumy;

public enum MoneyType {
    GR(1), PLN(2), KILO(3);
    int value;

    MoneyType(int value) {
        this.value = value;
    }
}
