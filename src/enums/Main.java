package enums;

public class Main {
    static void main(String[] args) {
        // Use enum
        Level level = Level.MEDIUM;
        System.out.println(level);
        System.out.println(level.getDescription());

        // Enum in a Switch statement
        switch (level) {
            case LOW:
                System.out.println("Low level!");
                break;
            case MEDIUM:
                System.out.println("Medium level!");
                break;
            case HIGH:
                System.out.println("High level!");
                break;
        }

        // Loop through an enum
        for (Level levelValue : Level.values()) {
            System.out.println(levelValue + ": " + levelValue.getDescription());
        }
    }
}
