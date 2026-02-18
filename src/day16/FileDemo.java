package day16;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        // Writing to a file
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is my Day 16 of learning Java!\n");
            writer.write("Learning File I/O is interesting.");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading from the same file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line;

            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}

