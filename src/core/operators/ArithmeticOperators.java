package core.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        // Addition operator: adds together two values
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction operator: subtracts one value from another
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication operator: multiplies two values
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division operator: divides one value by another
        int quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);

        // Modulus operator: returns the division remainder
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);

        // Increment operator: increases the value of a variable by 1
        num1++;
        ++num2;
        System.out.println("Incremented num1: " + num1);
        System.out.println("Incremented num2: " + num2);

        // Decrement operator: decreases the value of a variable by 1
        num1--;
        --num2;
        System.out.println("Decremented num1: " + num1);
        System.out.println("Decremented num2: " + num2);
    }
}
