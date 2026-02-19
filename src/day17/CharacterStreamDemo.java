package day17;

import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("charFile.txt");
            writer.write("Hello Character Stream");
            writer.close();
            System.out.println("Data written using Character Stream.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


