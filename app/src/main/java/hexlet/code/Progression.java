package hexlet.code;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Game.game;

public class Progression {
    public static void playProgression() {
        System.out.println("What number is missing in the progression?");
        var isPlaying = true;
        do {
            isPlaying = isProgression();
        } while (Game.isPlaying(isPlaying));
    }

    private static boolean isProgression() {
        final var lengthOfProgression = 10;
        final var highBoundOfNum = 20;
        final var highBoundOfStep = 5;
        var number = RANDOM.nextInt(1, highBoundOfNum);
        var step = RANDOM.nextInt(1, highBoundOfStep);
        var hide = RANDOM.nextInt(1, lengthOfProgression);
        var rightAnswer = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= lengthOfProgression; i++) {
            if (i == hide) {
                stringBuilder.append("..");
                rightAnswer = number;
            } else {
                stringBuilder.append(number);
            }
            number += step;
            if (i != lengthOfProgression) {
                stringBuilder.append(" ");
            }
        }
        return game(String.valueOf(rightAnswer), stringBuilder.toString());
    }
}
