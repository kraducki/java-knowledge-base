package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {
        try {
            readFile("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        // you can also add try/catch there
        FileReader reader = new FileReader(fileName);
    }

    // Checked exceptions are exceptions that Java makes you deal with one way or another at compile time
    // That means before a program will compile succesfully, Java checks to ensure a developer is dealing with a possibility of that happening
}
