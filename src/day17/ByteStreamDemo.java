package day17;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("byteFile.txt");
            fos.write("Hello Byte Stream".getBytes());
            fos.close();
            System.out.println("Data written using Byte Stream.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

