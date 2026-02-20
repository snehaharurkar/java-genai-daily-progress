package day18;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
                .filter(n -> n > 15)        // Keep numbers greater than 15
                .map(n -> n * 2)            // Multiply each by 2
                .forEach(n -> System.out.println(n));  // Print each
    }
}
