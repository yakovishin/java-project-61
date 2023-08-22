package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void isEvenNumber(String username) {
        var successCount = 0;
        var scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var continueGame = true;
        while (continueGame) {
            var maxBound = 100;
            var randomInt = new Random().nextInt(maxBound);
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: " );
            var userAnswer = scanner.nextLine();
            var rightAnswer = randomInt % 2 == 0 ? "yes" : "no";
            if (userAnswer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Correct!");
                successCount++;
                if (successCount == 3) {
                    continueGame = false;
                    System.out.printf("Congratulations, %s!\n", username);
                }
            } else {
                System.out.printf("""
                        'yes' is wrong answer ;(. Correct answer was 'no'.
                        Let's try again, %s!
                        """, userAnswer);
                continueGame = false;
            }
        }
    }
}
