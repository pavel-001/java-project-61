/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String numGame = scanner.next();

        switch (numGame) {
            case "1" -> Cli.greet();
            case "2" -> Even.evenNum();
            case "3" -> Calc.calcGame();
            case "4" -> Gcd.gcdGame();
            case "5" -> Progression.progGame();
            case "6" -> Prime.primeGame();
            default -> System.out.println("Exit");
        }
        scanner.close();
    }
}
