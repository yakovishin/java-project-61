package hexlet.code;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Game.game;
import static hexlet.code.Game.isPlaying;

public class Gcd {

    public static void playGcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        var playing = true;
        do {
            playing = isGcd();
        }
        while (isPlaying(playing));
    }

    private static boolean isGcd() {
        final var highBound = 100;
        var firstNumber = RANDOM.nextInt(highBound);
        var secondNumber = RANDOM.nextInt(highBound);
        var rightAnswer = 0;
        var min = Math.min(firstNumber, secondNumber);
        for (int i = min; i > 0; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                rightAnswer = i;
                break;
            }
        }
        var expression = firstNumber + " " + secondNumber;
        return game(String.valueOf(rightAnswer), expression);
    }
}
