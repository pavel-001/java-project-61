package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void gcdGame() {
        Engine engine = new Engine();
        System.out.println("Find the greatest common divisor of given numbers.");
        boolean resGame = false;
        for (int i = 1; i <= 3; i++) {
            StringBuilder quest = new StringBuilder();
            int num = (int) (Math.random() * 10 + 1);
            int n1 = (int) (Math.random() * 10 + 1) * num;
            int n2 = (int) (Math.random() * 10 + 1) * num;
            int j = Math.min(n1, n2);
            while (n1 % j == 0 && n2 % j <= 0) {
                num = j;
                j--;
            }
            quest.append(n1);
            quest.append(" ");
            quest.append(n2);
            resGame = engine.question(quest.toString(), String.valueOf(num));
            if (resGame) {
                break;
            }
        }
        engine.result(resGame);
    }
}
