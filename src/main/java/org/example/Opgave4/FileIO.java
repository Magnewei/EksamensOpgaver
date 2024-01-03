package org.example.Opgave4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public void saveToFile(String shape) {
        String path = "src/main/java/org/example/Opgave4/save.txt";
        File file = new File(path);
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
