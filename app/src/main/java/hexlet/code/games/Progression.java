package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progGame() {
        Engine engine = new Engine();
        System.out.println("Please enter the game number and press Enter.");
        boolean resGame = false;
        for (int i = 1; i <= 3; i++) {
            int begin = (int) (Math.random() * 10);
            int step = (int) (Math.random() * 10 + 1);
            int amount = (int) (Math.random() * 10 + 5);
            int num = (int) (Math.random() * 100) % amount;
            StringBuilder res = new StringBuilder();
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < amount; j++) {
                if (j == num) {
                    res.append(begin);
                    str.append("..");
                } else {
                    str.append(begin);
                }
                str.append(" ");
                begin += step;
            }
            resGame = engine.question(str.toString(), res.toString());
            if (resGame) {
                break;
            }
        }
        engine.result(resGame);
    }
}
