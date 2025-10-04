package methods;

public class Recursion {
    public static int sum(int num) {
        // Base case: if num is less than or equal to 0, return 0
        if (num <= 0) {
            return 0;
        }

        // Recursive case: return num plus the sum of numbers from 1 to num - 1
        return num + sum(num - 1);
    }

    public static int sum(int start, int end) {
        // Base case: if end is less than or equal to start, return end
        if (end <= start) {
            return end;
        }

        // Recursive case: return end plus the sum of numbers from start to end - 1
        return end + sum(start, end - 1);
    }

    public static void main(String[] args) {
        int result1 = sum(10);
        System.out.println("The sum of numbers from 1 to 10 is: " + result1);

        int result2 = sum(5, 10);
        System.out.println("The sum of numbers from 5 to 10 is: " + result2);
    }
}
