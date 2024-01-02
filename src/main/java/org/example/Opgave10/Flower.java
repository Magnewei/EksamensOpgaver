package org.example.Opgave10;

public class Flower {
    private final String name;
    private final int price;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", price: " + price;
    }
}
