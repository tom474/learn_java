package advancedtopics;

public class Generic {
    static class Box<T> {
        T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println("Value: " + stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(100);
        System.out.println("Value: " + integerBox.getValue());
    }
}
