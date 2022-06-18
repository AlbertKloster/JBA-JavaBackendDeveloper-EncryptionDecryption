package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

    public static void save(String outData, String out) {
        File file = new File("./" + out);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(outData);
        } catch (IOException e) {
            System.out.printf("An exception occurred %s", e.getMessage());
        }
    }

    public static String load(String in) {
        File file = new File("./" + in);
        StringBuilder builder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext())
                builder.append(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + in);
        }
        return builder.toString();
    }
}
