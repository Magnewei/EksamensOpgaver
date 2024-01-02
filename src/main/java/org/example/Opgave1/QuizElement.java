package org.example.Opgave1;

public class QuizElement {
    private final int correctAnswer;
    private final String question;

    public QuizElement(int correctAnswer, String question) {
        this.correctAnswer = correctAnswer;
        this.question = question;
    }

    public boolean isCorrect(int answer) {
        return (answer == correctAnswer);
    }

    // Returns question.
    public String getQuestion() {
        return question;
    }
}
