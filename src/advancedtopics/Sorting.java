package advancedtopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    static void main(String[] args) {
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        Comparator myComparator1 = new SortByYear();
        Collections.sort(myCars, myComparator1);

        for (Car car : myCars) {
            System.out.println(car.brand + " " + car.model + " " + car.year);
        }

        Collections.sort(
                myCars, (obj1, obj2) -> {
                    Car car1 = obj1;
                    Car car2 = obj2;
                    if (car1.year > car2.year) {
                        return -1;
                    }
                    if (car1.year < car2.year) {
                        return 1;
                    }
                    return 0;
                }
        );

        for (Car car : myCars) {
            System.out.println(car.brand + " " + car.model + " " + car.year);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Comparator myComparator2 = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator2);

        for (int i : myNumbers) {
            System.out.println(i);
        }

        ArrayList<Game> myGames = new ArrayList<Game>();
        myGames.add(new Game("The Legend of Zelda: Breath of the Wild", "Nintendo", 2017));
        myGames.add(new Game("Red Dead Redemption 2", "Rockstar Games", 2018));
        myGames.add(new Game("The Witcher 3: Wild Hunt", "CD Projekt", 2015));

        Collections.sort(myGames);

        for (Game game : myGames) {
            System.out.println(game.name + " " + game.publisher + " " + game.year);
        }
    }

    static class Car {
        public String brand;
        public String model;
        public int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
    }

    static class SortByYear implements Comparator {
        public int compare(Object obj1, Object obj2) {
            Car car1 = (Car) obj1;
            Car car2 = (Car) obj2;

            // Compare the year of both objects
            if (car1.year < car2.year) {
                return -1;
            }
            if (car1.year > car2.year) {
                return 1;
            }
            return 0;
        }
    }

    static class SortEvenFirst implements Comparator {
        public int compare(Object obj1, Object obj2) {
            Integer int1 = (Integer) obj1;
            Integer int2 = (Integer) obj2;

            boolean aIsEven = (int1 % 2) == 0;
            boolean bIsEven = (int2 % 2) == 0;

            if (aIsEven == bIsEven) {
                if (int1 < int2) {
                    return -1;
                }
                if (int1 > int2) {
                    return 1;
                }
                return 0;
            } else {
                if (aIsEven) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

    static class Game implements Comparable {
        public String name;
        public String publisher;
        public int year;

        public Game(String name, String publisher, int year) {
            this.name = name;
            this.publisher = publisher;
            this.year = year;
        }

        public int compareTo(Object obj) {
            Game other = (Game) obj;
            if (year < other.year) {
                return -1;
            }
            if (year > other.year) {
                return 1;
            }
            return 0;
        }
    }
}
