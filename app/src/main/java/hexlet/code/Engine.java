package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class Engine {
    private static String name;
    public Engine() {
        name = Cli.greet();
    }
    public static boolean question(String q, String res) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + q);
        System.out.print("Your answer: ");
        String ans = scanner.next();
        if (ans.equalsIgnoreCase(res)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + res + "'.");
            System.out.println("Let's try again, " + name + "!");
            return true;
        }
        return false;
    }
    public static void result(boolean err) {
        if (!err) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
