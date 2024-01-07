package org.example.QuizRefactor;

import java.util.Collections;
import java.util.List;

public class QuizElement {
    private final String question;
    private final String correctAnswer;
    private final List<String> answers;

    public QuizElement(String question, String correctAnswer, List<String> answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
        Collections.shuffle(answers);
    }

    @Override
    public String toString() {
        String present = "";
        int i = 1;
        for (String answer : answers) {
            present += i + ": " + answer + "\n";
            i++;
        }
        return question + "\n" + present;
    }

    public boolean isCorrect(String answer) {
        if (answer.equalsIgnoreCase(correctAnswer)) {
            return true;
        }
        return false;
    }

    public String getAnswer(int i) {
        return answers.get(i);
    }
}
