import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderSimple {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt"); // Make sure this file exists in your project root
            Scanner scanner = new Scanner(file);

            System.out.println("Contents of the file:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
