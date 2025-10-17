package advancedtopics;

import java.util.ArrayList;

public class Wrapper {
    static void main(String[] args) {
        // Wrapper Classes
        // ArrayList<int> myNumbers = new ArrayList<int>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        System.out.println(myNumbers);

        // Creating Wrapper Objects
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
