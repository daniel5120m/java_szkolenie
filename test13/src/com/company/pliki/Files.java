package com.company.pliki;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Files {
//    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("src/com/company/employees.txt");
//        List<String> lines = Files.readAllLines(path);
//
//        List<Employee> employees = new ArrayList<>();
//
//        for (int i=0; i<lines.size(); i++) {
//            if (lines.get(i).equals("EmployeeData")) {
//                String[] name = lines.get(i + 1).split(",");
//                int age = Integer.parseInt(lines.get(i + 2));
//                boolean fullTime = lines.get(i+3).equalsIgnoreCase("y");
//                employees.add(new Employee(name[0], name[1], age, fullTime));
//            }
//        }
//
//        employees.forEach(System.out::println);
//
//        Path savePath = Paths.get("src/com/company/employees.json");
//        Files.write(savePath, toJson(employess).getBytes(StandardCharsets.UTF_8));
//    }
}
