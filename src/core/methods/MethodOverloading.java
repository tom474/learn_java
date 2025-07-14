package core.methods;

public class MethodOverloading {
    public static void myMethod(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void myMethod(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        // Method with a single parameter
        myMethod("Cuong");
        myMethod("Tom");

        // Method with multiple parameters
        myMethod("Cuong", 18);
        myMethod("Tom", 20);
    }
}
