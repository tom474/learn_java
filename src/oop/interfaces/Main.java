package oop.interfaces;

public class Main {
    static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();

        DemoClass demoClass = new DemoClass();
        demoClass.firstMethod();
        demoClass.secondMethod();
    }
}
