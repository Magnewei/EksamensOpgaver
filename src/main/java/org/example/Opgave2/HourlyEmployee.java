package org.example.Opgave2;

public class HourlyEmployee extends Employee {
    private final int numberOfHours;
    private final double payPerHour;

    public HourlyEmployee(int numberOfHours, double payPerHour) {
        this.numberOfHours = numberOfHours;
        this.payPerHour = payPerHour;
    }

    @Override
    public double calculateSalary() {
        return payPerHour * numberOfHours;
    }
}
