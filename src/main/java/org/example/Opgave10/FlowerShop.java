package org.example.Opgave10;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class FlowerShop {
    private final List<Flower> flowers = new ArrayList<>();
    private final List<Flower> boughtFlowers = new ArrayList<>();
    private final int maximumAmountOfFlowers = 3;
    private int totalPrice = 0;
    private final Scanner scanner = new Scanner(System.in);
    public void runDialog() {
        presentList();
        buyFlowers();
        buyBouquet();
    }

    private void presentList() {
        flowers.add(new Flower("Rose", 20));
        flowers.add(new Flower("Tulip", 20));
        flowers.add(new Flower("Daisy", 20));
        flowers.add(new Flower("Lily", 20));
        flowers.add(new Flower("Rose", 40));
        flowers.add(new Flower("Sunflower", 40));
        flowers.add(new Flower("Carnation", 80));
        flowers.add(new Flower("Chrysanthemum", 80));
        flowers.add(new Flower("Hydrangea", 80));
        flowers.add(new Flower("Peony",80));

        System.out.println("Welcome to the flower shop! We carry many flowers, here's a list! \n");
        int number = 1;  // Used for number of flower in list.
        for (Flower flower : flowers) {
            System.out.println(number + ". " + flower);
            number++;
        }
    }

    private void buyFlowers() {
            while (maximumAmountOfFlowers > boughtFlowers.size()) {
                try {
                    String input = scanner.nextLine();

                    // If input is "Q", quits the menu.
                    if (input.equalsIgnoreCase("q")) {
                        System.out.println("Exiting program!");
                        break;

                        // If input isn't within 1-10. Avoids IllegalArgument and indexOutOfBounds exception.
                    } else if (Integer.parseInt(input) < 1 || Integer.parseInt(input) > 10) {
                        System.out.println("Please type an input within the range of the list.");
                        buyFlowers();
                    } else {
                        int index = Integer.parseInt(input) - 1;  // -1 is used to get correct flower from list.
                        Flower boughtFlower = flowers.get(index);
                        boughtFlowers.add(boughtFlower);
                        totalPrice += boughtFlower.getPrice();
                        System.out.println(boughtFlower.getName() + " was added to the basket.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Please type a valid input.");
                }
            }
        }

    private void buyBouquet() {
        while (maximumAmountOfFlowers == boughtFlowers.size()) {
            System.out.println("Do you wish to buy a bouquet, for an extra 50 kr?");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                totalPrice += 50;
            }
            System.out.println("\nThe total price of your cart is: " + totalPrice + ".\nThanks for purchasing at the shop.");
        }
    }
}
