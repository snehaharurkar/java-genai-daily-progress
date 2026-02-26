package day24;

import java.util.*;

public class FixedFiveLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            String line = sc.nextLine();
            System.out.println(i + " " + line);
        }

        sc.close();
    }
}
