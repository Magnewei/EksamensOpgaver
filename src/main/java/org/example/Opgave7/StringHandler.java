package org.example.Opgave7;

public class StringHandler {

    // Student object method
    public String replaceString(Student student) {

        // If student is female, gender == "She", else gender == "He";
        String gender = student.getGender().equals("Female") ? "She" : "He";

        // Returns student's toString with pronoun instead of name.
        return student.toString().replace(student.getName(), gender);
    }


    // String method
    public String replaceText(String text) {
        String[] names = {"Katrine", "Stine", "Anders", "Joakim"};

        for (String name : names) {
            if (text.contains(name)) {
                String gender = (name.equals("Katrine") || (name.equals("Stine"))) ? "She" : "He";
                return text.replace(name, gender);  // Replace name with pronoun and text
            }
        }
        return text;  // If no name is found, return String as it was.
    }


    // Generically replaces student's name with "They"
    public String anonymizeGender(Student student) {

        // Returns student's toString with pronoun instead of name.
        return student.toString().replace(student.getName(), "They");
    }
}
