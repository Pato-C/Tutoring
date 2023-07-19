package org.example.week5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("path/to/file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

