package advancedtopics;

import java.util.ArrayList;

public class Annotation {
    static class Animal {
        public void makeSound() {
            System.out.println("Animal sound!");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    @Deprecated
    static void oldMethod() {
        System.out.println("This method is outdated.");
    }

    @SuppressWarnings({"unchecked"})
    static void testSuppressWarning() {
        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        System.out.println(cars);
    }

    static void main(String[] args) {
        // @Override Annotation
        Animal myDog = new Dog();
        myDog.makeSound();

        // @Deprecated Annotation
        oldMethod();

        // @SuppressWarnings Annotation
        testSuppressWarning();
    }
}
