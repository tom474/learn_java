package oop.anonymous;

public class Main {
    static void main(String[] args) {
        Animal animal = new Animal() {
            public void makeSound() {
                System.out.println("Animal make another sound!");
            }
        };
        animal.makeSound();

        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello World!");
            }
        };
        greeting.sayHello();
    }
}
