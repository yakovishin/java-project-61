package hexlet.code;

import static hexlet.code.Engine.SCANNER;

public class Cli {
    private static String name = "unknown";
    public static void setName() {
        System.out.print("May I have your name? ");
        name = SCANNER.next();
        System.out.printf("Hello, %s!\n", name);
    }

    public static String getName() {
        return name;
    }
}

