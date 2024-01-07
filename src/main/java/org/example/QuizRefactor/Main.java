package org.example.QuizRefactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Question 1
        quiz.addQuizElement(new QuizElement(
                "1: What is the capital of France?",
                "1: Paris",
                Arrays.asList("1: Paris", "2: Berlin", "3: Rome", "4: Madrid")
        ));

        // Question 2
        quiz.addQuizElement(new QuizElement(
                "2: Which planet is known as the Red Planet?",
                "2: Mars",
                Arrays.asList("1: Jupiter", "2: Mars", "3: Venus", "4: Saturn")
        ));

        // Question 3
        quiz.addQuizElement(new QuizElement(
                "3: Who wrote 'Romeo and Juliet'?",
                "2: William Shakespeare",
                Arrays.asList("1: Charles Dickens", "2: William Shakespeare", "3: Jane Austen", "4: Mark Twain")
        ));

        // Question 4
        quiz.addQuizElement(new QuizElement(
                "4: What is the largest mammal in the world?",
                "2: Blue Whale",
                Arrays.asList("1: Elephant", "2: Blue Whale", "3: Giraffe", "4: Polar Bear")
        ));

        // Question 5
        quiz.addQuizElement(new QuizElement(
                "5: In which year did the Titanic sink?",
                "2: 1912",
                Arrays.asList("1: 1905", "2: 1912", "3: 1920", "4: 1931")
        ));

        // Question 6
        quiz.addQuizElement(new QuizElement(
                "6: What is the chemical symbol for gold?",
                "1: Au",
                Arrays.asList("1: Au", "2: Ag", "3: Fe", "4: Cu")
        ));

        // Question 7
        quiz.addQuizElement(new QuizElement(
                "7: Who painted the Mona Lisa?",
                "2: Leonardo da Vinci",
                Arrays.asList("1: Vincent van Gogh", "2: Leonardo da Vinci", "3: Pablo Picasso", "4: Michelangelo")
        ));

        // Question 8
        quiz.addQuizElement(new QuizElement(
                "8: What is the largest ocean on Earth?",
                "4: Pacific Ocean",
                Arrays.asList("1: Atlantic Ocean", "2: Indian Ocean", "3: Southern Ocean", "4: Pacific Ocean")
        ));

        // Question 9
        quiz.addQuizElement(new QuizElement(
                "9: Which element has the chemical symbol 'O'?",
                "1: Oxygen",
                Arrays.asList("1: Oxygen", "2: Gold", "3: Sodium", "4: Carbon")
        ));

        // Question 10
        quiz.addQuizElement(new QuizElement(
                "10: Who is known as the 'Father of Computer Science'?",
                "1: Alan Turing",
                Arrays.asList("1: Alan Turing", "2: Bill Gates", "3: Steve Jobs", "4: Mark Zuckerberg")
        ));

        quiz.run();
    }
}

