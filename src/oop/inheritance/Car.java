package oop.inheritance;

public class Car extends Vehicle {
    private final String modelName = "Mustang";

    static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.brand + " " + car.modelName);
        car.honk();
    }
}
