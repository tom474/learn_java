package core.math;

public class MathMethod {
    public static void main(String[] args) {
        // Max: Returns the greater of two values
        System.out.println("Max of 5 and 10: " + Math.max(5, 10));

        // Min: Returns the lesser of two values
        System.out.println("Min of 5 and 10: " + Math.min(5, 10));

        // Square Root: Returns the square root of a value
        System.out.println("Square root of 25: " + Math.sqrt(25));

        // Absolute Value: Returns the absolute value of a number
        System.out.println("Absolute value of -10: " + Math.abs(-10));

        // Random Number: Generates a random number between 0.0 and 1.0
        System.out.println("Random number between 0 and 1: " + Math.random());
        System.out.println("Random number between 0 and 100: " + (int) (Math.random() * 100));
    }
}
