package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        Engine engine = new Engine();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        boolean resGame = false;
        for (int i = 1; i <= 3; i++) {
            int num = (int) (Math.random() * 100 + 2);
            String res = "yes";
            for (int j = num - 1; j >= 2; j--) {
                if (num % j == 0) {
                    res = "no";
                    break;
                }
            }
            resGame = engine.question(String.valueOf(num), res);
            if (resGame) {
                break;
            }
        }
        engine.result(resGame);
    }
}
