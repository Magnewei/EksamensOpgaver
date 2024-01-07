package org.example.Opgave6;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addOrderLine(new OrderLine(new Item("carrot", 12), 10));
        order.addOrderLine(new OrderLine(new Item("apple", 8), 8));
        order.addOrderLine(new OrderLine(new Item("pear", 9), 7));
        order.addOrderLine(new OrderLine(new Item("bread", 20), 8));

        System.out.println("\nTotal amount of orders: "+ order.amountOfOrders() + ". Total price of orders: " + order.getTotalPrice() + ".");
        System.out.println("\nOrders consist of:");
        order.printList();
    }
}
