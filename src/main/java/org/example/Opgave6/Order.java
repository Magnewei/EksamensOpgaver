package org.example.Opgave6;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderLine> orderLines = new ArrayList<>();


    public double getTotalPrice() {
        double totalPrice = 0;
        for (OrderLine order : orderLines) {
              totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    @Override
    public String toString() {
        return "The total price of the order is: " + getTotalPrice();
    }

    public int amountOfOrders() {
        int totalOrders = 0;
        for (OrderLine order : orderLines) {
            totalOrders += order.getAmount();
        }
        return totalOrders;
    }

    public void printList() {
        if (orderLines != null) {
            for (OrderLine order : orderLines) {
                System.out.println(order);
            }
        }
    }

}
