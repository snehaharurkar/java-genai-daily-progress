package day21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Student Class (OOP)
class Student {
    String name;
    int age;
    double marks;

    public Student(String name, int age, double marks) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be positive!");
        }
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Marks: " + marks;
    }
}

public class StudentManager {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try {
            students.add(new Student("Alice", 20, 85));
            students.add(new Student("Bob", 19, 72));
            students.add(new Student("Charlie", 21, 90));
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // Stream: Filter students with marks > 80
        System.out.println("Students scoring above 80:");
        students.stream()
                .filter(s -> s.marks > 80)
                .forEach(System.out::println);

        // Write to file
        try {
            FileWriter writer = new FileWriter("students.txt");
            for (Student s : students) {
                writer.write(s.toString() + "\n");
            }
            writer.close();
            System.out.println("Student data saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
