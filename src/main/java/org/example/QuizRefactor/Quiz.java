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

        elements.forEach( (n) -> {System.out.println(n); play(n); });

        System.out.println("Thanks for playing. You had " + correctAnswers + " correct responses and "
                + wrongAnswers + " wrong responses." + "\nThanks for playing.");
    }


    private void play(QuizElement quizElement) {
        try {
            int input = scanner.nextInt();

            if ((input <= 4 && input >= 1)) {
                checkAnswer(quizElement, quizElement.getAnswer(input));

            } else {
                System.out.println("Please type an integer between 1-4.");
                play(quizElement);
            }
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





