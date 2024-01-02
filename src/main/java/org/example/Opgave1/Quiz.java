package org.example.Opgave1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<QuizElement> elements = new ArrayList<>();
    private int correctAnswers, wrongAnswers;
    private final Scanner scanner = new Scanner(System.in);

    public void addQuizElement(QuizElement quiz) {
        elements.add(quiz);
    }

    public void run() {
        // Printed on game start.
        System.out.println("Welcome to the game!" +
                "\nYou will be given a question and 4 answers. Only 1 answer is correct." +
                "\nPick an answer by typing the respective number in the list." +
                "\nThe game will exit when you have answered all questions ");

        // Loop runs continue until elements is empty,
        // in which case all questions have been answered.
        for (QuizElement element : elements) {

            // Asks current question.
            System.out.println(element.getQuestion());
            play(element);

        }

        // Printed on game exit or finish.
        System.out.println("Thanks for playing. You had " + correctAnswers + " correct responses and "
                + wrongAnswers + " wrong responses." + "\nThanks for playing.");
        scanner.close();
    }


    private void play(QuizElement quizElement) {

        try {
            int input = scanner.nextInt();

            // If integer is within range of 1-4, check if answer is correct.
            if ((input <= 4 && input >= 1)) {
                checkAnswer(quizElement, input);

                // If input is outside of range, print error and request new input.
            } else {
                System.out.println("Please type an integer between 1-4.");
                scanner.nextLine();
                play(quizElement);
            }

            // If input is not an integer, print error and request new input.
        } catch (InputMismatchException e) {
            System.out.println("Please type an integer.");
            scanner.nextLine();
            play(quizElement);
        }
    }

    // Checks a given quizElement and it's input, to see if answer is correct. Prints message accordingly.
    private void checkAnswer(QuizElement quizElement, int answer) {
        if (quizElement.isCorrect(answer)) {
            correctAnswers++;
            System.out.println("Your answer was correct! You have " + correctAnswers + " correct answers!");

        } else {
            wrongAnswers++;
            System.out.println("You answered wrong! You have " + wrongAnswers + " wrong answers!");
        }
    }
}


