package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static void main(String[] args) {
        try {
            File file = new File("src/files/filename.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
