package files;

import java.io.File;

public class DeleteFolder {
    static void main(String[] args) {
        File file = new File("src/files/test");
        if (file.delete()) {
            System.out.println("Deleted the folder: " + file.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
