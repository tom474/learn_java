package arrays;

public class Array {
    static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Access array elements
        System.out.println("First car: " + cars[0]);

        // Change an array element
        cars[0] = "Opel";
        System.out.println("Updated first car: " + cars[0]);

        // Array length
        System.out.println("Number of cars: " + cars.length);

        // Loop through the array
        System.out.println("Cars in the array:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // For-each loop
        System.out.println("Cars using for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
