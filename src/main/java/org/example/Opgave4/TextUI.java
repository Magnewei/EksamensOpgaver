package org.example.Opgave4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextUI {
    private final Scanner scanner = new Scanner(System.in);
    private final Loops loops = new Loops();

    // Starts main loop
    public void run() {
        System.out.println("Welcome to the application. Please type an integer corresponding to the length of the shape.");
        inputLoop();
        scanner.close();
    }

    public void chooseToSave(String shape) {
        System.out.println("Do you wish to save the shape to a file?\n[Yes/No]");
        FileIO fileIO = new FileIO();
        String input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "YES":
                fileIO.saveToFile(shape);
                break;

            case "NO":
                break;

            default:
                System.out.println("Please type a valid input.");
        }
    }


    // Parses user input and handles exceptions.
    private void inputLoop() {
        try {
            int input = scanner.nextInt();
            printShape(input);

        } catch (InputMismatchException e){
            System.out.println("Please type an integer.");
            scanner.nextLine();
            inputLoop();
        }
    }


    // Prints triangle according to user input.
    private void printShape(int length) {
        scanner.nextLine();
            System.out.println("Please type L or R to print the left or right side of a triangle. Alternatively write 'Square' to print a square.");
            String input = scanner.nextLine();

            // .toUpperCase disables case sensitivity.
            switch (input.toUpperCase()) {
                case "R":
                    System.out.println(loops.drawRightTriangle(length));
                    chooseToSave(loops.drawRightTriangle(length));
                    break;

                case "L":
                    System.out.println(loops.drawLeftTriangle(length));
                    chooseToSave(loops.drawLeftTriangle(length));
                    break;

                case "SQUARE":
                    System.out.println(loops.drawSquare(length));
                    chooseToSave(loops.drawSquare(length));
                    break;

                default:
                    System.out.println("Please type a valid shape.");
            }
    }


}
