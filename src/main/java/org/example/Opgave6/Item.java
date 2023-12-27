package org.example.Opgave6;

public class Item {
    private final String name;
    private final int price;


    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item " + name + " costs " + price + ".";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
