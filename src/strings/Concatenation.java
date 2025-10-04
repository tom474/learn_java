package strings;

public class Concatenation {
    public static void main(String[] args) {
        String firstName = "Tom";
        String lastName = "Tran";
        int age = 20;

        // Add two strings
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));

        // Add a string and an integer
        System.out.println(firstName + " " + lastName + " is " + age + " years old.");
    }
}
