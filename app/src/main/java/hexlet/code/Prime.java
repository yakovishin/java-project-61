package hexlet.code;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Game.game;
import static hexlet.code.Game.isPlaying;
import static hexlet.code.StringUtils.NO;
import static hexlet.code.StringUtils.YES;

public class Prime {

    public static void playPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var isPlaying = true;
        do {
            isPlaying = isPrime();
        } while (isPlaying(isPlaying));
    }

    public static boolean isPrime() {
        final var number = RANDOM.nextInt(1, 100);
        final var firstPrimeNumber = 2;
        if (number != firstPrimeNumber && number % 2 == 0 || number == 1) {
            return game(NO, String.valueOf(number));
        }
        for (int i = number - 1; i > firstPrimeNumber; i--) {
            if (number % i == 0) {
                return game(NO, String.valueOf(number));
            }
        }
        return game(YES, String.valueOf(number));
    }
}
