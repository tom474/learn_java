package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src/files/filename.txt");
            fileWriter.write("Files in Java might be tricky, but it is fun enough!");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
