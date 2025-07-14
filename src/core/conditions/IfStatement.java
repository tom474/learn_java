package core.conditions;

public class IfStatement {
    public static void main(String[] args) {
        int time;

        // The if statement
        time = 10;
        if (time < 12) {
            System.out.println("Good morning!");
        }

        // The else statement
        time = 15;
        if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        // The else if statement
        time = 20;
        if (time < 12) {
            System.out.println("Good morning!");
        } else if (time < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }

        // Shorthand if statement (ternary operator)
        String result = (time < 18) ? "Good day!" : "Good evening!";
        System.out.println(result);
    }
}
