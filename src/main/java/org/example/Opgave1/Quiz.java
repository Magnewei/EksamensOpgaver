package org.example.Opgave1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<QuizElement> elements = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private int correctAnswers, wrongAnswers;
    public void addQuizElement(QuizElement quiz) {
        elements.add(quiz);
    }


    // Runs game loop and prints message on game start and end.
    public void run() {
        System.out.println("Welcome to the game!" +
                "\nYou will be given a question and 4 answers. Only 1 answer is correct." +
                "\nPick an answer by typing the respective number in the list." +
                "\nThe game will exit when you have answered all questions ");


        // Loop runs continue until elements is empty,
        // in which case all questions have been answered.
        for (QuizElement element : elements) {

            // Asks current question.
            System.out.println(element.getQuestion());
            playQuiz(element);

        }
        // Printed on game exit or finish.
        System.out.println("Thanks for playing. You had " + correctAnswers + " correct responses and "
                + wrongAnswers + " wrong responses." + "\nThanks for playing.");
    }


    // Parses user input and throws errors if input is wrong.
    private void playQuiz(QuizElement element) {
        try {
            int input = scanner.nextInt();
            if (element.isCorrect(input)) {
                correctAnswers++;
                System.out.println("Your answer was correct! You have " + correctAnswers + " correct answers!");

                // Checks if input is not 1-4.
            } else if (!(input <= 4 && input >= 1)) {
                System.out.println("Please type an input within 1-4 response.");
                scanner.nextLine();
                playQuiz(element);

                // Answer is wrong
            } else {
                wrongAnswers++;
                System.out.println("You answered wrong! You have " + wrongAnswers + " wrong answers!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please type an in integer.");
            scanner.nextLine();
            playQuiz(element);
        }
    }
}


