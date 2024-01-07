package org.example.QuizRefactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Question 1
        quiz.addQuizElement(new QuizElement(
                "1: What is the capital of France?",
                "Paris",
                Arrays.asList("Paris", "Berlin", "Rome", "Madrid")
        ));

        // Question 2
        quiz.addQuizElement(new QuizElement(
                "2: Which planet is known as the Red Planet?",
                "Mars",
                Arrays.asList("Jupiter", "Mars", "Venus", "Saturn")
        ));

        // Question 3
        quiz.addQuizElement(new QuizElement(
                "3: Who wrote 'Romeo and Juliet'?",
                "William Shakespeare",
                Arrays.asList("Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain")
        ));

        // Question 4
        quiz.addQuizElement(new QuizElement(
                "4: What is the largest mammal in the world?",
                "Blue Whale",
                Arrays.asList("Elephant", "Blue Whale", "Giraffe", "Polar Bear")
        ));

        // Question 5
        quiz.addQuizElement(new QuizElement(
                "5: In which year did the Titanic sink?",
                "1912",
                Arrays.asList("1905", "1912", "1920", "1931")
        ));

        // Question 6
        quiz.addQuizElement(new QuizElement(
                "6: What is the chemical symbol for gold?",
                "Au",
                Arrays.asList("Au", "Ag", "Fe", "Cu")
        ));

        // Question 7
        quiz.addQuizElement(new QuizElement(
                "7: Who painted the Mona Lisa?",
                "Leonardo da Vinci",
                Arrays.asList("Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo")
        ));

        // Question 8
        quiz.addQuizElement(new QuizElement(
                "8: What is the largest ocean on Earth?",
                "Pacific Ocean",
                Arrays.asList("Atlantic Ocean", "Indian Ocean", "Southern Ocean", "Pacific Ocean")
        ));

        // Question 9
        quiz.addQuizElement(new QuizElement(
                "9: Which element has the chemical symbol 'O'?",
                "Oxygen",
                Arrays.asList("Oxygen", "Gold", "Sodium", "Carbon")
        ));

        // Question 10
        quiz.addQuizElement(new QuizElement(
                "10: Who is known as the 'Father of Computer Science'?",
                "Alan Turing",
                Arrays.asList("Alan Turing", "Bill Gates", "Steve Jobs", "Mark Zuckerberg")
        ));

        quiz.run();
    }
}
