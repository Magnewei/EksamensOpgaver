package org.example.Opgave4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextUI {
    private final Scanner scanner = new Scanner(System.in);
    private final Loops loops = new Loops();

    public void play() {
        System.out.println("Welcome to the application." + "\nPlease type a number corresponding to the size of the triangle.");

        startGame();

    }

    private void startGame() {
        try {
            int x = scanner.nextInt();
            if (x > 0) {
                drawTriangle(x);
            }
        } catch (InputMismatchException e){
            System.out.println("Please type an integer.");
            scanner.nextLine();
            startGame();

        }

    }


    private void drawTriangle(int x) {
        try {
            scanner.nextLine();
            System.out.println("Please type L or R to print a left or right angled triangle.");

            String input = scanner.nextLine();

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

        } catch (InputMismatchException e) {
            System.out.println("Please type a valid input.");
        }
    }

}
