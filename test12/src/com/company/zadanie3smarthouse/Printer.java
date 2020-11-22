package com.company.zadanie3smarthouse;

public abstract class Printer {

    private String printerName;

    public void printProcess(String text) {
        System.out.println(text);
    }

    public abstract int inkReduce();

    public abstract int ink

    public void inkLevel(int inkLvl) {
        switch (inkLvl) {
            case 1:
                System.out.println("empty");
                inkLevelGraph(inkLvl);
                break;
            case 2:
                System.out.println("low");
                inkLevelGraph(inkLvl);
                break;
            case 3:
                System.out.println("medium");
                inkLevelGraph(inkLvl);
                break;
            case 4:
                System.out.println("high");
                inkLevelGraph(inkLvl);
                break;
            case 5:
                System.out.println("full");
                inkLevelGraph(inkLvl);
                break;
            default:
                System.out.println("Błąd odczytu");
        }

    }

    public void inkLevelGraph(int inkLvl) {
        for (int inkCount = 0; inkCount <= inkLvl; inkCount++) {
            System.out.print("#");
        }
    }
}

