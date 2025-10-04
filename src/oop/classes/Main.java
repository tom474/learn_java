package oop.classes;

// Create a class
public class Main {
    int x = 5;

    static void main(String[] args) {
        // Create an object
        Main myObj = new Main();
        System.out.println(myObj.x);

        // Create multiple objects
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
