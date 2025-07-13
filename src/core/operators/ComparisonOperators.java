package core.operators;

public class ComparisonOperators {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        // Equal to operator: checks if two values are equal
        boolean isEqual = (num1 == num2);
        System.out.println("Is num1 equal to num2?: " + isEqual);

        // Not equal to operator: checks if two values are not equal
        boolean isNotEqual = (num1 != num2);
        System.out.println("Is num1 not equal to num2?: " + isNotEqual);

        // Greater than operator: checks if the left value is greater than the right value
        boolean isGreaterThan = (num1 > num2);
        System.out.println("Is num1 greater than num2?: " + isGreaterThan);

        // Less than operator: checks if the left value is less than the right value
        boolean isLessThan = (num1 < num2);
        System.out.println("Is num1 less than num2?: " + isLessThan);

        // Greater than or equal to operator: checks if the left value is greater than or equal to the right value
        boolean isGreaterThanOrEqual = (num1 >= num2);
        System.out.println("Is num1 greater than or equal to num2?: " + isGreaterThanOrEqual);

        // Less than or equal to operator: checks if the left value is less than or equal to the right value
        boolean isLessThanOrEqual = (num1 <= num2);
        System.out.println("Is num1 less than or equal to num2?: " + isLessThanOrEqual);
    }
}
