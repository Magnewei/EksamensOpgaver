package org.example.Opgave7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringHandler stringHandler = new StringHandler();

        // Initialize student objects and add them to ArrayList.
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Katrine", "Female", 12));
        studentList.add(new Student("Stine", "Female", 04));
        studentList.add(new Student("Anders", "Male", 10));
        studentList.add(new Student("Joakim", "Male", 07));


        // Call replaceString to replace name with pronoun on each student object
        for (Student s : studentList) {
            s.setTime(10 + studentList.indexOf(s));
            System.out.println(stringHandler.replaceString(s));
        }

        // Call anonymizeGender() on each student object
        for (Student s : studentList) {
            s.setTime(10 + studentList.indexOf(s));
            System.out.println(stringHandler.anonymizeGender(s));
        }


        /*
        //String parameter in place of student object
         String[] names = {"Katrine", "Stine", "Anders", "Joakim"};
         int time = 10;
        for (Student s : studentList) {
            //time++;
            System.out.println(stringHandler.replaceText(s.toString()));
        }
         */


    }
}
