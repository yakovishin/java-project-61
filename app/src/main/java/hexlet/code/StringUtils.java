package hexlet.code;

public final class StringUtils {
    public static final String QUESTION = "Question: %s\n";
    public static final String USER_ANSWER = "Your answer: ";
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String CORRECT = "Correct!";

    // PATTERNS
    public static final String PATTER_INCORRECT_ANSWER =
                        """
    '%s' is wrong answer ;(. Correct answer was '%s'.
    Let's try again, %s!
            """;

    public static final String PATTERN_CONGRATULATION = "Congratulations, %s!\n";
}
