package day05;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentmarksUsingobject {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> marks = new ArrayList<>();

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            // Taking marks input
            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks of student " + (i + 1) + ": ");
                marks.add(sc.nextInt());
            }

            // Display marks
            System.out.println("\nStudent Marks:");
            for (int m : marks) {
                System.out.println(m);
            }

            // Calculate total
            int total = 0;
            for (int m : marks) {
                total += m;
            }

            // Calculate average
            double average = (double) total / marks.size();

            System.out.println("\nTotal Marks: " + total);
            System.out.println("Average Marks: " + average);

            sc.close();
        }
    }


