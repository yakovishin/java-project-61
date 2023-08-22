package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        var scanner = new Scanner(System.in);
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        System.out.print("Your choice: " );
        var choice = scanner.nextInt();
        System.out.println();
        if (choice != 0) {
            System.out.println("Welcome to the Brain Games!");
        }
        switch (choice) {
            case 1 :
                Cli.setName();
                break;
            case 2 :
                Cli.setName();
                Even.isEvenNumber(Cli.name);
                break;
        }

        scanner.close();
    }
}
