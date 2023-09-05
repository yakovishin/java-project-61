package hexlet.code;

import java.util.function.Predicate;

import static hexlet.code.Engine.SCANNER;
import static hexlet.code.StringUtils.CORRECT;
import static hexlet.code.StringUtils.PATTERN_CONGRATULATION;
import static hexlet.code.StringUtils.PATTER_INCORRECT_ANSWER;
import static hexlet.code.StringUtils.QUESTION;
import static hexlet.code.StringUtils.USER_ANSWER;

public class Game {

    private static int  winCount = 0;
    private static final int END_WIN_COUNT = 3;

    public static boolean game(String rightAnswer, String expression) {
        Predicate<String> predicate = userAnswer -> userAnswer.equals(rightAnswer);
        System.out.printf(QUESTION, expression);
        System.out.print(USER_ANSWER);
        var userAnswer = SCANNER.next();
        var result = predicate.test(userAnswer);
        if (!result) {
            System.out.printf(PATTER_INCORRECT_ANSWER, userAnswer, rightAnswer, Cli.getName());
        }
        return result;
    }

    public static boolean isPlaying(boolean isPlaying) {
        if (!isPlaying) {
            return false;
        }
        System.out.println(CORRECT);
        winCount++;
        if (winCount == END_WIN_COUNT) {
            System.out.printf(PATTERN_CONGRATULATION, Cli.getName());
            return false;
        }
        return true;
    }
}
