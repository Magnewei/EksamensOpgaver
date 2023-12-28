package org.example.Opgave4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextUI {
    private final Scanner scanner = new Scanner(System.in);
    private final Loops loops = new Loops();


    // Starts main loop
    public void run() {
        System.out.println("Welcome to the application." + "\nPlease type a number corresponding to the size of the triangle.");
        inputLoop();
    }


    // Parses user input and handles exceptions.
    private void inputLoop() {
        try {
            int x = scanner.nextInt();
            if (x > 0) {
                printTriangle(x);
            }
        } catch (InputMismatchException e){
            System.out.println("Please type an integer.");
            scanner.nextLine();
            inputLoop();
        }
    }


    // Prints triangle according to user input.
    private void printTriangle(int x) {
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
