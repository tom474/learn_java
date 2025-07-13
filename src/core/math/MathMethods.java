package core.math;

public class MathMethods {
    public static void main(String[] args) {
        // Max
        System.out.println("Max of 5 and 10: " + Math.max(5, 10));

        // Min
        System.out.println("Min of 5 and 10: " + Math.min(5, 10));

        // Square Root
        System.out.println("Square root of 25: " + Math.sqrt(25));

        // Absolute Value
        System.out.println("Absolute value of -10: " + Math.abs(-10));

        // Random Number
        System.out.println("Random number between 0 and 1: " + Math.random());
        System.out.println("Random number between 0 and 100: " + (int) (Math.random() * 100));
    }
}
