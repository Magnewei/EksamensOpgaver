package org.example.Opgave7;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final String gender;
    private final int grade;
    private int time;

    public Student(String name, String gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " drew the exam question at " + time + ".00 o'clock." + " The student achieved a grade of " + grade + ".";
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
