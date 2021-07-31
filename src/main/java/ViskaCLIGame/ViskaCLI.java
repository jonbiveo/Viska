package ViskaCLIGame;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class ViskaCLI {

    Player player;
    public static final Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Please make a selection by typing 1 or 2.");
            System.out.println("1) Start Adventure");
            System.out.println("2) Exit");
            int menuInput = scanner.nextInt();
            try {
                if (menuInput == 1) {
                    greeting();
                } else if (menuInput == 2) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter 1 or 2.");
            }
        }
    }

    public void greeting() {
        System.out.println("Good morning. What's your name?");
        int range = (100-50) + 1;
        try {
            String name = scanner.next();
            int healthGetter = 50 + (int)(Math.random() * range);
            player = new Player(name, healthGetter);
            choice1();
        } catch (Exception e) {
            System.out.println("Don't break my stuff.");
        }
    }

    public void displayHealth() {
        System.out.println("Health: " + player.getHealth());
    }

    public void choice1() {
        boolean stay = true;
        try {
            while (stay) {
                System.out.println("Nice to meet you " + player.getName() + ".");
                displayHealth();
                System.out.println("You've woken up in a dark-lit, damp cave." +
                        "\nWhat would you like to do?");
                System.out.println("1) Check backpack");
                System.out.println("2) Look around");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Functionality not implemented yet.");
                } else if (choice == 2) {
                    choice2();
                }
            }
        } catch (Exception e) {
            System.out.println("Don't break it.");
        }
    }

    public void choice2() {
        boolean stay = true;
        try {

        } catch (Exception e) {
            System.out.println("Don't break it.");
        }
    }

    public void displayMenuOptions() {
    }

    public static void main(String[] args) {
        ViskaCLI cli = new ViskaCLI();
        cli.run();
    }
}
