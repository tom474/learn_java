package oop.polymorphism;

public class Dog extends Animal {
    public String type = "Dog";

    public Dog() {
        super();
        System.out.println("Dog created successfully!");
    }

    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says: bow wow!");
    }

    public void printType() {
        System.out.println(super.type);
    }
}
