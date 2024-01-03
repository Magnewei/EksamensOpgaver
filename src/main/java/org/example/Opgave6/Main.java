package org.example.Opgave6;

public class Main {
    public static void main(String[] args) {
        Item carrot = new Item("carrot", 12);
        Item apple = new Item("apple", 8);
        Item pear = new Item("pear", 9);
        Item bread = new Item("bread", 20);

        Order order = new Order();
        order.addOrderLine(new OrderLine(carrot, 10));
        order.addOrderLine(new OrderLine(apple, 8));
        order.addOrderLine(new OrderLine(pear, 7));
        order.addOrderLine(new OrderLine(bread, 8));

        System.out.println("\nTotal amount of orders: "+ order.amountOfOrders() + ". Total price of orders: " + order.getTotalPrice() + ".");
        System.out.println("\nOrders consist of:");
        order.printList();

    }
}
