package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        System.out.println("Hello, " + scanner.next());
        scanner.close();
    }
}
