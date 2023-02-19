package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void calcGame() {
        Engine engine = new Engine();
        System.out.println("What is the result of the expression?");
        boolean resGame = false;
        int res;
        for (int i = 1; i <= 3; i++) {
            StringBuilder quest = new StringBuilder();
            int n1 = (int) (Math.random() * 10 + 1);
            int n2 = (int) (Math.random() * 10 + 1);
            int randomChar = (int) (Math.random() * 100) % 3;
            String[] c = {" - ", " + ", " * "};
            quest.append(n1);
            quest.append(c[randomChar]);
            quest.append(n2);
            if (randomChar == 0) {
                res = n1 - n2;
            } else {
                if (randomChar == 1) {
                    res = n1 + n2;
                } else {
                    res = n1 * n2;
                }
            }
            resGame = engine.question(quest.toString(), String.valueOf(res));
            if (resGame) {
                break;
            }
        }
        engine.result(resGame);
    }
}
