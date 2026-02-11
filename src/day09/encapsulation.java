package day09;
    public class encapsulation {
        public static class Student {

    // Private variables (data hiding)
    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            this.marks = 0;
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Main method
    public static void main(String[] args) {

        Student s1 = new Student("Sneha", 85);
        s1.displayDetails();

        System.out.println("Updating marks...");
        s1.setMarks(95);
        s1.displayDetails();

        System.out.println("Trying invalid update...");
        s1.setMarks(150); // Should show validation message
    }
}

}
