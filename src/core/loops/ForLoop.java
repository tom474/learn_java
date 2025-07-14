package core.loops;

public class ForLoop {
    public static void main(String[] args) {
        // For loop: executes a block of code a specific number of times
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("Finished for loop!");

        // For loop with multiple variables: allows multiple variables to be initialized and updated
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
        System.out.println("Finished for loop with multiple variables!");

        // Nested for loops: allows one for loop to be inside another
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Outer loop: " + i + ", Inner loop: " + j);
            }
        }
        System.out.println("Finished nested for loops!");

        // For loop with an array: iterates over elements in an array
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }
        System.out.println("Finished for loop with array!");

        // For-each loop: simplifies iteration over arrays and collections
        String[] cars = {"Toyota", "Honda", "Ford"};
        for (String car : cars) {
            System.out.println("Car: " + car);
        }
        System.out.println("Finished for-each loop!");

        // Break statement: exits the loop immediately
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Finished loop with break!");

        // Continue statement: skips the current iteration and continues with the next
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue;
            }
            System.out.println("Odd number: " + i);
        }
        System.out.println("Finished loop with continue!");
    }
}
