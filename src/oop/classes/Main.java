package oop.classes;

// Create a class
public class Main {
    // Class attributes
    final int x = 3;
    int y = 4;
    int z;

    public Main(int z) {
        this.z = z;
        this(6, z);
    }

    public Main(int y, int z) {
        this.y = y;
        this.z = z;
    }

    static void main(String[] args) {
        // Create an object
        Main myObj = new Main(5);
        System.out.println(myObj);

        // Create multiple objects
        Main myObj1 = new Main(5);
        Main myObj2 = new Main(5);
        System.out.println(myObj1);
        System.out.println(myObj2);

        // Access attributes
        System.out.println("x = " + myObj.x);
        System.out.println("y = " + myObj.y);
        System.out.println("z = " + myObj.z);

        // Modify attributes
        // Cannot modify final attribute
        // myObj.x = 30;
        myObj.y = 40;
        myObj.z = 50;
        System.out.println("x = " + myObj.x);
        System.out.println("y = " + myObj.y);
        System.out.println("z = " + myObj.z);
        myObj1.y = 20;
        System.out.println(myObj1.y);
        System.out.println(myObj2.y);

        // Call method
        myStaticMethod();
        myObj.myPublicMethod();
        myObj1.myPublicMethod(100);

        // Modifiers
        Student student = new Student();
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        // System.out.println("Height: " + student.height);
        System.out.println("Weight: " + student.weight);
        System.out.println("Graduation year: " + student.graduationYear);
        student.study();
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("This is my static method!");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("This is my public method!");
    }

    public void myPublicMethod(int param) {
        System.out.println("Param: " + param);
    }
}
