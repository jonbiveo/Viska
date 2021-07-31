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
                    loadPlayer();
                } else if (menuInput == 2) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter 1 or 2.");
            }
        }
    }

    public void loadPlayer() { // In run() method
        boolean stay = true;
        try {
            while (stay) {
                System.out.println("Good morning. What's your name?");
                String name = scanner.nextLine();
                if (Objects.equals(name, "*")) {
                    player = new Player(name, new BigDecimal("100"));
                    choice1();
                } else {
                    System.out.println("Enter a name using regular characters.");
                }
            }
        } catch (Exception e) {
            System.out.println("Don't break my stuff.");
        }
    }

    public void choice1() {
        boolean stay = true;
        try {
            while (stay) {
                System.out.println("Nice to meet you " + player.getName() + ".");
            }
        } catch (Exception e) {
            System.out.println("Don't break it.");
        }
    }

    public void displayMenuOptions() { //In loadPlayer() method
    }

    public static void main(String[] args) {
        ViskaCLI cli = new ViskaCLI();
        cli.run();
    }
}
