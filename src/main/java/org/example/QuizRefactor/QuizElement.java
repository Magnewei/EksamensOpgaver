package org.example.QuizRefactor;

import java.util.Collections;
import java.util.List;

public class QuizElement {
    private String question;
    private String correctAnswer;
    private List<String> answers;

    public QuizElement(String question, String correctAnswer, List<String> answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
        Collections.shuffle(answers);
    }


    @Override
    public String toString() {
        String present = "";

        for (String answer : answers) {
            present += answer + "\n";
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
