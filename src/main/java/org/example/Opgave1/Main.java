package org.example.Opgave1;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        String question1 = "1: What is the capital of France?" +
                "\n   1: Paris" +
                "\n   2: Berlin" +
                "\n   3: Rome" +
                "\n   4: Madrid";

        String question2 = "2: Which planet is known as the Red Planet?" +
                "\n   1: Jupiter" +
                "\n   2: Mars" +
                "\n   3: Venus" +
                "\n   4: Saturn";

        String question3 = "3: Who wrote 'Romeo and Juliet'?" +
                "\n   1: Charles Dickens" +
                "\n   2: William Shakespeare" +
                "\n   3: Jane Austen" +
                "\n   4: Mark Twain";

        String question4 = "4: What is the largest mammal in the world?" +
                "\n   1: Elephant" +
                "\n   2: Blue Whale" +
                "\n   3: Giraffe" +
                "\n   4: Polar Bear";

        String question5 = "5: In which year did the Titanic sink?" +
                "\n   1: 1905" +
                "\n   2: 1912" +
                "\n   3: 1920" +
                "\n   4: 1931";


        String question6 = "6: What is the chemical symbol for gold?" +
                "\n   1: Au" +
                "\n   2: Ag" +
                "\n   3: Fe" +
                "\n   4: Cu";

        String question7 = "7: Who painted the Mona Lisa?" +
                "\n   1: Vincent van Gogh" +
                "\n   2: Leonardo da Vinci" +
                "\n   3: Pablo Picasso" +
                "\n   4: Michelangelo";


        String question8 = "8: What is the largest ocean on Earth?" +
                "\n   1: Atlantic Ocean" +
                "\n   2: Indian Ocean" +
                "\n   3: Southern Ocean" +
                "\n   4: Pacific Ocean";

        String question9 = "9: Which element has the chemical symbol 'O'?" +
                "\n   1: Oxygen" +
                "\n   2: Gold" +
                "\n   3: Sodium" +
                "\n   4: Carbon";

        String question10 = "10: Who is known as the 'Father of Computer Science'?" +
                "\n    1: Alan Turing" +
                "\n    2: Bill Gates" +
                "\n    3: Steve Jobs" +
                "\n    4: Mark Zuckerberg";

        quiz.addQuizElement(new QuizElement(1, question1));
        quiz.addQuizElement(new QuizElement(1, question2));
        quiz.addQuizElement(new QuizElement(1, question3));
        quiz.addQuizElement(new QuizElement(1, question4));
        quiz.addQuizElement(new QuizElement(1, question5));
        quiz.addQuizElement(new QuizElement(1, question6));
        quiz.addQuizElement(new QuizElement(1, question7));
        quiz.addQuizElement(new QuizElement(1, question8));
        quiz.addQuizElement(new QuizElement(1, question9));
        quiz.addQuizElement(new QuizElement(1, question10));

        quiz.playGame();


    }
}
