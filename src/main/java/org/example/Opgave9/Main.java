
package org.example.Opgave9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Magnus", "hidden", "something@mail.com", 911));
        users.add(new User("Magna",  "hidd3n", "something@mail.com"));
        users.add(new User("Mikkel",  "hidd3n"));
        users.add(new User("Katrine", "HiddenPassWord"));

        // Test when password is null.
        String nullPassword = null;
        //users.add(new User("Katrine", nullPassword));

        for (User user : users) {
            System.out.println(user);
        }

    }




}
