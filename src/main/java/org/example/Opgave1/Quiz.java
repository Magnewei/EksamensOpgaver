package org.example.Opgave1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<QuizElement> elements = new ArrayList<>();
    private int correctAnswers, wrongAnswers;

    public void addQuizElement(QuizElement quiz) {
        elements.add(quiz);
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

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
            int input = scanner.nextInt();

            // Prints first statement if condition is true, second statement if false.
            // Increments correctAnswers/wrongAnswers depending on response.
            if(element.isCorrect(input)) {
                correctAnswers++;
                System.out.println("Your answer was correct! You have " + correctAnswers + " correct answers!");

                // Checks if input is not 1-4.
            } else if(!(input == 1 || input == 2 || input == 3 || input == 4)) {
                System.out.println("Please type a valid response.");
                scanner.nextLine();

                // Answer is wrong
            } else {
                wrongAnswers++;
                System.out.println("You answered wrong! You have " + correctAnswers + " wrong answers!");
            }
        }
        // Printed on game exit or finish.
        System.out.println("Thanks for playing. You had " + correctAnswers + " correct responses and "
                + wrongAnswers + " wrong responses." +  "\nThanks for playing.");
        }
    }


