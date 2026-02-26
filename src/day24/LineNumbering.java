package day24;

import java.util.*;

public class LineNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(counter + " " + line);
            counter++;
        }

        sc.close();
    }
}
