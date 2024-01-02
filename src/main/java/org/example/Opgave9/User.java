package org.example.Opgave9;

public class User {
    private String name;
    private String password;
    private String email;
    private int phonenumber;

    public User(String name, String password) {
        // Checks password and name length.
        if(!(password.length() >2 && name.length() >2) || !(name.length() <=9 && name.length() <=9)) {
            throw new IllegalArgumentException("Make sure that your password and " +
                    "name are at least two characters long and at most 9 characters long.");
        }

        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String email) {
        // Checks password and name length.
        if(!(password.length() >2 && name.length() >2) || !(name.length() <=9 && name.length() <=9)) {
            throw new IllegalArgumentException("Make sure that your password and " +
                    "name are at least two characters long and at most 9 characters long.");
        }

        // Naive email validation check.
        if (!email.contains("@") && email != null) {
            email += "@mail.com";
        }

        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, String email, int phonenumber) {

        // Checks password and name length.
        if(!(password.length() >2 && name.length() >2) || !(name.length() <=9 && name.length() <=9)) {
            throw new IllegalArgumentException("Make sure that your password and " +
                    "name are at least two characters long and at most 9 characters long.");
        }

        // Naive email validation check.
        if (!email.contains("@") && email != null) {
            email += "@mail.com";
        }

        this.name = name;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phonenumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        String combination = "";

        if (name != null) {
            combination += "\nThe user's name is: " + name + ".";
        }

        if (phonenumber != 0) {
            combination += "\nUsers phone number is: " + phonenumber + ".";
        }

        if (email != null) {
            combination += "\nUsers email is: " + email + ".";
        }

        if (password != null) {
            combination += "\nUser has a hidden password.";
        }

        return combination;

    }

}
