package advancedtopics;

import java.util.ArrayList;
import java.util.function.Consumer;



public class LambdaExpression {
    interface StringFunction {
        String run(String string);
    }

    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Lambda Expression
        numbers.forEach((n) -> { System.out.println(n); });

        // Lambda in Variable
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach(method);

        // Lambda as Method Parameter
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

    }

    static void printFormatted(String string, StringFunction stringFunction) {
        String result = stringFunction.run(string);
        System.out.println(result);
    }
}
