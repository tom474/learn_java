package oop.polymorphism;

public class Main {
    static void main(String[] args) {
        Animal animal = new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
        dog.printType();
    }
}
