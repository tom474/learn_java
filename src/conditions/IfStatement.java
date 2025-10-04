package conditions;

public class IfStatement {
    static void main(String[] args) {
        int time;

        // If statement: checks a condition and executes code if true
        time = 10;
        if (time < 12) {
            System.out.println("Good morning!");
        }

        // Else statement: checks a condition and executes code if the previous condition is false
        time = 15;
        if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        // Else if statement: checks multiple conditions in sequence
        time = 20;
        if (time < 12) {
            System.out.println("Good morning!");
        } else if (time < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }

        // Shorthand if statement (ternary operator): a compact way to write an if-else statement
        String result = (time < 18) ? "Good day!" : "Good evening!";
        System.out.println(result);
    }
}
