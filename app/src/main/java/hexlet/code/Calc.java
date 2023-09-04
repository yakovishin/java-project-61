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
        var firstNumber = RANDOM.nextInt(10);
        var secondNumber = RANDOM.nextInt(10);
        var operation = RANDOM.nextInt(1, 4);  // Operation bound from 1 to 3
        int answer;
        switch (operation) {
            case 1 -> {
                answer = firstNumber + secondNumber;
                return game(String.valueOf(answer), firstNumber + " + " + secondNumber);
            }
            case 2 -> {
                answer = firstNumber - secondNumber;
                return game(String.valueOf(answer), firstNumber + " - " + secondNumber);
            }
            case 3 -> {
                answer = firstNumber * secondNumber;
                return game(String.valueOf(answer), firstNumber + " * " + secondNumber);
            }
            default -> {
                return false;
            }
        }
    }
}
