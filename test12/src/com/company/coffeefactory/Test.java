package com.company.coffeefactory;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        DeliveryModule deliveryModule = new DeliveryModule();

        Sorting sorting = new Sorting();

        OutputProcess outputProcess = new OutputProcess();

        ProducentDriver producentDriver = deliveryModule.getProducentDriver();

        List<String> codes = new ArrayList<>();
        SortedCoffe sortedCoffe = sorting.sort(codes, producentDriver);

        outputProcess.process(sortedCoffe);
    }
}
