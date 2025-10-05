package files;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("src/files/filename.txt", true)) {
            fileWriter.write("\nAppended text!");
            System.out.println("Successfully appended to the file!");
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
