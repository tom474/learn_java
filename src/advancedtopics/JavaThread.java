package advancedtopics;

public class JavaThread extends Thread {
    public static int amount = 0;

    public void run() {
        System.out.println("This code is running in a thread!");
        amount++;
    }

    static void main(String[] args) {
        JavaThread thread = new JavaThread();
        thread.start();
        System.out.println("This code is outside of the thread!");

        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }

        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
