package org.example.week5;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendingExample {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("path/to/file.txt", true)) {
            writer.write("This line will be appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

