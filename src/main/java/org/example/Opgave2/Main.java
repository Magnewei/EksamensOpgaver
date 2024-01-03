package org.example.Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new MonthlyEmployee(20000));
        employees.add(new ComissionEmployee(10000, 500, 0.2));
        employees.add(new HourlyEmployee(37, 220));

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}
