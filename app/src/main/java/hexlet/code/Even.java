package hexlet.code;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Game.game;
import static hexlet.code.StringUtils.CORRECT;
import static hexlet.code.StringUtils.NO;
import static hexlet.code.StringUtils.PATTERN_CONGRATULATION;
import static hexlet.code.StringUtils.YES;

public class Even {

    public static void playEvenNumber() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var winCount = 0;
        while (isEvenNumber()) {
            System.out.println(CORRECT);
            winCount++;
            if (winCount == 3) {
                System.out.printf(PATTERN_CONGRATULATION, Cli.getName());
                break;
            }
        }
    }
    private static boolean isEvenNumber() {
        var maxBound = 100;
        var randomInt = RANDOM.nextInt(maxBound);
        var rightAnswer = randomInt % 2 == 0 ? YES : NO;
        return game(rightAnswer, String.valueOf(randomInt));
    }
}
