package hexlet.code;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Game.game;
import static hexlet.code.Game.isPlaying;

public class Calc {

    public static void playCalc() {
        System.out.println("What is the result of the expression?");
        var playing = true;
        do {
            playing = isCalc();
        }
        while (isPlaying(playing));
    }

    private static boolean isCalc() {
        var boundOfRandomNumber = 10;
        var firstNumber = RANDOM.nextInt(boundOfRandomNumber);
        var secondNumber = RANDOM.nextInt(boundOfRandomNumber);
        var leastBoundOperation = 1;
        var highNotIncludedBoundOperation = 4;
        var operation = RANDOM.nextInt(leastBoundOperation, highNotIncludedBoundOperation);
        int answer;
        final var sum = 1;
        final var sub = 2;
        final var mul = 3;
        switch (operation) {
            case sum -> {
                answer = firstNumber + secondNumber;
                return game(String.valueOf(answer), firstNumber + " + " + secondNumber);
            }
            case sub -> {
                answer = firstNumber - secondNumber;
                return game(String.valueOf(answer), firstNumber + " - " + secondNumber);
            }
            case mul -> {
                answer = firstNumber * secondNumber;
                return game(String.valueOf(answer), firstNumber + " * " + secondNumber);
            }
            default -> {
                return false;
            }
        }
    }
}
