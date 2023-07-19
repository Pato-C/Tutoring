package org.example.week5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("path/to/file.txt"))) {
            writer.write("Hello, world!");
            writer.newLine();
            writer.write("This is a new line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

