package operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int num = 7;
        System.out.println("Initial value: " + num);

        // Assignment operator: assigns a value to a variable
        num = 10;
        System.out.println("After assignment: " + num);

        // Addition assignment operator: same as num = num + value
        num += 5;
        System.out.println("After += 5: " + num);

        // Subtraction assignment operator: same as num = num - value
        num -= 3;
        System.out.println("After -= 3: " + num);

        // Multiplication assignment operator: same as num = num * value
        num *= 2;
        System.out.println("After *= 2: " + num);

        // Division assignment operator: same as num = num / value
        num /= 3;
        System.out.println("After /= 3: " + num);

        // Modulus assignment operator: same as num = num % value
        num %= 3;
        System.out.println("After %= 3: " + num);
    }
}
