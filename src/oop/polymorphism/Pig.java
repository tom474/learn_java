package oop.polymorphism;

public class Pig extends Animal {
    public String type = "Pig";

    public Pig() {
        super();
        System.out.println("Pig created successfully!");
    }

    public void animalSound() {
        super.animalSound();
        System.out.println("The pig says: wee wee!");
    }
}
