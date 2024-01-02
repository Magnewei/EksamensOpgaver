package org.example.Opgave6;

public class OrderLine {
    private final Item item;
    private final int amount;

    public OrderLine(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public double getTotalPrice() {
        return item.getPrice() * amount;
    }

    @Override
    public String toString() {
        return "Bought " + amount + " " + item + ".";
    }

    public int getAmount() {
        return amount;
    }
}
