package com.company.enumy;

public class RunClass {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(12, 40, 10);
        System.out.println(wallet.toPrint());
        System.out.println(wallet.calculateTotalBalance());

        wallet.addMoney(12, MoneyType.GR);
        System.out.println(wallet.toPrint());
        System.out.println(wallet.calculateTotalBalance());

        wallet.subtractMoney(5, MoneyType.PLN);
        System.out.println(wallet.toPrint());
        System.out.println(wallet.calculateTotalBalance());
    }
}



