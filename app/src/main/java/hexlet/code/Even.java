package hexlet.code;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Game.game;
import static hexlet.code.Game.isPlaying;
import static hexlet.code.StringUtils.NO;
import static hexlet.code.StringUtils.YES;

public class Even {

    public static void playEvenNumber() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var playing = true;
        do {
            playing = isEvenNumber();
        }
        while (isPlaying(playing));
    }
    private static boolean isEvenNumber() {
        var maxBound = 100;
        var randomInt = RANDOM.nextInt(maxBound);
        var rightAnswer = randomInt % 2 == 0 ? YES : NO;
        return game(rightAnswer, String.valueOf(randomInt));
    }
}
