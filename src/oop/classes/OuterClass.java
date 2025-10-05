package oop.classes;

// Outer class
public class OuterClass {
    public int x = 10;

    // Static inner class
    static class StaticInnerClass {
        int y = 5;
    }

    // Public inner class
    public class PublicInnerClass {
        int y = 5;

        public int myInnerMethod() {
            return x;
        }
    }

    // Private inner class
    private class PrivateInnerClass {
        int y = 5;

        public int myInnerMethod() {
            return x;
        }
    }
}
