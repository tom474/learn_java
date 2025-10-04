package loops;

public class WhileLoop {
    static void main(String[] args) {
        int countdown = 10;

        // While loop: executes as long as the condition is true
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        System.out.println("Finished while loop!");

        // Do-while loop: executes at least once before checking the condition
        countdown = 10;
        do {
            System.out.println("Countdown: " + countdown);
            countdown--;
        } while (countdown < 5);
        System.out.println("Finished do-while loop!");

        // Break statement: exits the loop immediately
        countdown = 10;
        while (countdown > 0) {
            if (countdown == 5) {
                System.out.println("Breaking at countdown = " + countdown);
                break;
            }
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        System.out.println("Finished loop with break!");

        // Continue statement: skips the current iteration and continues with the next
        countdown = 10;
        while (countdown > 0) {
            countdown--;
            if (countdown % 2 == 0) {
                System.out.println("Skipping even countdown: " + countdown);
                continue;
            }
            System.out.println("Odd countdown: " + countdown);
        }
        System.out.println("Finished loop with continue!");
    }
}
