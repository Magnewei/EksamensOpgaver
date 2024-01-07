package org.example.QuizRefactor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<QuizElement> elements = new ArrayList<>();
    private int correctAnswers, wrongAnswers;
    private final Scanner scanner = new Scanner(System.in);

    public void addQuizElement(QuizElement quizElement) {
        elements.add(quizElement);
    }

    public void run() {
        System.out.println("Welcome to the game!" +
                "\nYou will be given a question and 4 answers. Only 1 answer is correct." +
                "\nPick an answer by typing the respective number in the list." +
                "\nThe game will exit when you have answered all questions ");

        for (QuizElement element : elements) {
            System.out.println(element);
            play(element);
        }

        System.out.println("Thanks for playing. You had " + correctAnswers + " correct responses and "
                + wrongAnswers + " wrong responses." + "\nThanks for playing.");
        scanner.close();
    }


    private void play(QuizElement quizElement) {
        try {
            int input = scanner.nextInt();

            if ((input <= 4 && input >= 1)) {
                checkAnswer(quizElement, quizElement.getAnswer(input-1));

            } else {
                System.out.println("Please type an integer between 1-4.");
                play(quizElement);
            }

            // If input is not an integer, print error and request new input.
        } catch (InputMismatchException e) {
            System.out.println("Please type an integer.");
            scanner.nextLine();
            play(quizElement);
        }
    }

    private void checkAnswer(QuizElement quizElement, String answer) {
        if (quizElement.isCorrect(answer)) {
            correctAnswers++;
            System.out.println("Your answer was correct! You have " + correctAnswers + " correct answers!");

        } else {
            wrongAnswers++;
            System.out.println("You answered wrong! You have " + wrongAnswers + " wrong answers!");
        }
    }
}





