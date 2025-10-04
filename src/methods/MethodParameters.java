package methods;

public class MethodParameters {
    public static void mySingleMethod(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void myMultipleMethod(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    static void main(String[] args) {
        // Method with a single parameter
        mySingleMethod("Cuong");
        mySingleMethod("Tom");

        // Method with multiple parameters
        myMultipleMethod("Cuong", 18);
        myMultipleMethod("Tom", 20);
    }
}
