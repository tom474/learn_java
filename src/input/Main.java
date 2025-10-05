package input;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        System.out.println("Enter your height and weight: ");
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}
