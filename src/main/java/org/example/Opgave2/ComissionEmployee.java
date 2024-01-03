package org.example.Opgave2;

public class ComissionEmployee extends Employee {
    private final double baseSalary;
    private final double commission;
    private final double sale;

    public ComissionEmployee(double baseSalary, int comission, double sale) {
        this.baseSalary = baseSalary;
        this.commission = comission;
        this.sale = sale;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (commission *sale);
    }
}
