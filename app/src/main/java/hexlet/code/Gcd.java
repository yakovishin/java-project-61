package hexlet.code;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Game.game;
import static hexlet.code.Game.isPlaying;

public class Gcd {

    public static void playGcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        while (true) {
            if (!isPlaying(isGcd())) {
                break;
            }
        }
    }

    private static boolean isGcd() {
        var firstNumber = RANDOM.nextInt(100);
        var secondNumber = RANDOM.nextInt(100);
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
