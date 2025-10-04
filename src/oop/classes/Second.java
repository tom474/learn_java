package oop.classes;

public class Second {
    static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println(myObj);
        System.out.println("x = " + myObj.x);
        System.out.println("y = " + myObj.y);
        System.out.println("z = " + myObj.z);
        Main.myStaticMethod();
        myObj.myPublicMethod();
        myObj.myPublicMethod(100);
    }
}
