package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static String name = "unknown";
    public static void setName() {
        var scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.printf("Hello, %s!\n", name);
    }
}

