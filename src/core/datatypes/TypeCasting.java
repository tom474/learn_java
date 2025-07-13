package core.datatypes;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting: converting a smaller type to a larger type
        // byte -> short -> int -> long -> float -> double
        int myInt = 10;
        double myDouble = myInt;

        System.out.println("Int: " + myInt);
        System.out.println("Double: " + myDouble);

        // Narrowing Casting: converting a larger type to a smaller type
        // double -> float -> long -> int -> short -> byte
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;

        System.out.println("Double: " + myDouble2);
        System.out.println("Int: " + myInt2);
    }
}
