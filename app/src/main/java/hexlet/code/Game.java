package hexlet.code;

import java.util.function.Predicate;

import static hexlet.code.Engine.SCANNER;
import static hexlet.code.StringUtils.PATTER_INCORRECT_ANSWER;
import static hexlet.code.StringUtils.QUESTION;
import static hexlet.code.StringUtils.USER_ANSWER;

public class Game {

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
}
