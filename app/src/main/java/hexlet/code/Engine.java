package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static void run() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        var choice = SCANNER.nextInt();
        System.out.println();
        if (choice > 0) {
            System.out.println("Welcome to the Brain Games!");
            Cli.setName();
        }
        switch (choice) {
            case 2 -> {
                Even.playEvenNumber();
            }
            case 3 -> {
                Calc.playCalc();
            }
            case 4 -> {
                Gcd.playGcd();
            }
            case 5 -> {
                Progression.playProgression();
            }
            default -> {
            }
        }

        SCANNER.close();
    }
}
