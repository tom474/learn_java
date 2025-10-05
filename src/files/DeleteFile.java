package files;

import java.io.File;

public class DeleteFile {
    static void main(String[] args) {
        File file = new File("src/files/filename.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
