package day15;

// Custom Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method using "throws"
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // Manually throwing exception
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible!");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);  // Change value to test
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}

