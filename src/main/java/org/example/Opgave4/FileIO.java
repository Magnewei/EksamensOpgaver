package org.example.Opgave4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public void saveToFile(String shape) {
        File file = new File("src/main/java/org/example/Opgave4/save.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(shape);

            System.out.println("Successfully written");

            // close the file
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("File doesn't exist or isn't writeable.");
        }

    }
}
