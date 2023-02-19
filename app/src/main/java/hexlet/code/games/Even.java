package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void evenNum() {
        Engine engine = new Engine();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        boolean resGame = false;
        for (int i = 1; i <= 3; i++) {
            int num = (int) (Math.random() * 100 + 1);
            String res = (num % 2 == 0) ? "yes" : "no";
            resGame = engine.question(String.valueOf(num), res);
            if (resGame) {
                break;
            }
        }
        engine.result(resGame);
    }
}
