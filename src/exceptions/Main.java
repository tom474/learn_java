package exceptions;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    static void main(String[] args) {
        // Exception handling
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try-catch' is finished.");
        }

        // Method with throw error
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try-catch' is finished.");
        }

        // Method with throw error
        try {
            checkAge(20);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try-catch' is finished.");
        }

        // Multiple exceptions
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try-catch' is finished.");
        }

        // Multiple exception in one catch block
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
            int x = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Array error or math error occurred.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try-catch' is finished.");
        }

        // Close resources
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/exceptions/filename.txt");
            fileOutputStream.write("Hello World!".getBytes());
            fileOutputStream.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        // Try with resources
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/exceptions/filename.txt")) {
            fileOutputStream.write("Hello World!".getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            // Throw error
            throw new ArithmeticException("Access denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted: You are old enough!");
        }
    }
}
