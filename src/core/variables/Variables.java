package core.variables;

public class Variables {
    public static void main(String[] args) {
        // Declare variables
        String myString = "String";
        int myInteger = 7;
        float myFloat = 3.14f;
        char myChar = 'C';
        boolean myBool = true;

        // Print variables
        System.out.println("String: " + myString);
        System.out.println("Integer: " + myInteger);
        System.out.println("Float: " + myFloat);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBool);

        // Declare many variables
        int num1 = 1, num2 = 2, num3 = 3;
        System.out.println(num1 + num2 + num3);

        // Assign one value to many variables
        num1 = num2 = num3 = 10;
        System.out.println(num1 + num2 + num3);
    }
}
