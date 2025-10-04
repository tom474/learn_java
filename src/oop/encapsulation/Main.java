package oop.encapsulation;

public class Main {
    static void main(String[] args) {
        Person person = new Person("Cuong Tran");
        // person.name = "Tran Manh Cuong";
        person.setName("Tran Manh Cuong");
        System.out.println("Name: " + person.getName());
    }
}
