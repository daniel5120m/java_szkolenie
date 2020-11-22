package com.company.enumy;

import java.math.BigDecimal;

public class Wallet {
    private int numberOfGr;
    private int numberOfPLN;
    private int numberOfKilo;

    public Wallet(int numberOfGr, int numberOfPLN, int numberOfKilo) {
        this.numberOfGr = numberOfGr;
        this.numberOfPLN = numberOfPLN;
        this.numberOfKilo = numberOfKilo;
    }

    public void addMoney(int num, MoneyType type) {
        switch (type) {
            case GR:
                numberOfGr += num;
                break;
            case PLN:
                numberOfPLN += num;
                break;
            case KILO:
                numberOfKilo += num;
                break;
        }
    }

    public void subtractMoney(int num, MoneyType type) {
        switch (type) {
            case GR:
                numberOfGr -= num;
                break;
            case PLN:
                numberOfPLN -= num;
                break;
            case KILO:
                numberOfKilo -= num;
                break;
        }
    }

    public BigDecimal calculateTotalBalance() {
        return BigDecimal.valueOf(0.01)
                .multiply(BigDecimal.valueOf(numberOfGr))
                .add(BigDecimal.valueOf(1000 * numberOfKilo + numberOfPLN));
    }

    public String toPrint() {
        return toString();
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "numberOfGr=" + numberOfGr +
                ", numberOfPLN=" + numberOfPLN +
                ", numberOfKilo=" + numberOfKilo +
                '}';
    }
}


