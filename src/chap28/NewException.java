package chap28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewException {
    public void newScanFile(String fileName, String encoding) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName), encoding);
            System.out.println(scanner.nextLine());
        } catch (IllegalArgumentException | FileNotFoundException | NullPointerException exception) {
            exception.printStackTrace();
        }
    }
}
