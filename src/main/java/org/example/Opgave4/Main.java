package org.example.Opgave4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        promptPlayer();
    }

    static void promptPlayer() {
        Scanner scanner = new Scanner(System.in);
        Loops loops = new Loops();
        int x = 0;

        System.out.println("Welcome to the application." +
                "\nPlease type 'L' to print the left side of a triangle or 'R' to print the right side of a triangle." +
                "\nAfter choosing a side, please also pick a number, which will decide the length of the triangle.");

        String input = scanner.nextLine();
        x = scanner.nextInt();

        // X is only valid if above 0.
        if (x > 0) {

            // .toUpperCase disables case sensitivity.
            switch (input.toUpperCase()) {

                case "R":
                    loops.drawRightTriangle(x);
                    break;

                case "L":
                    loops.drawLeftTriangle(x);
                    break;

                default:
                    System.out.println("Please type a valid input.");
            }
        }

    }
}

