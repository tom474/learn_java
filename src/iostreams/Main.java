package iostreams;

import java.io.*;

public class Main {
    static void main(String[] args) {
        // Write to file
        String text = "Hello World!";
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/iostreams/filename1.txt")) {
            fileOutputStream.write(text.getBytes());
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/iostreams/filename2.txt"))) {
            bufferedWriter.write("First line.");
            bufferedWriter.newLine();
            bufferedWriter.write("Second line.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }

        // Append to file
        String appendedText = "\nAppended Text!";
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/iostreams/filename1.txt", true)) {
            fileOutputStream.write(appendedText.getBytes());
            System.out.println("Successfully appended to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/iostreams/filename2.txt", true))) {
            bufferedWriter.newLine();
            bufferedWriter.write("Appended line.");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        // Read file
        try (FileInputStream fileInputStream = new FileInputStream("src/iostreams/filename1.txt")) {
            int character;
            while ((character = fileInputStream.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/iostreams/filename2.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // Copy file
        try (FileInputStream fileInputStream = new FileInputStream("src/iostreams/filename1.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("src/iostreams/copy.txt")
        ) {
            int character;
            while ((character = fileInputStream.read()) != -1) {
                fileOutputStream.write(character);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
            e.printStackTrace();
        }
    }
}
