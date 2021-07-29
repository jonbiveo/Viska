package ViskaCLIGame;

import java.math.BigDecimal;
import java.util.Scanner;

public class ViskaCLI {

    Player player;
    public static final Scanner scanner = new Scanner(System.in);
    // should i do public static final for scanner class here?
    // should the scanner for user input even be here?

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
        while (stay) {
            System.out.println("Good morning. What's your name?");
            String name = scanner.nextLine();
            player = new Player(name, new BigDecimal("100"));
            System.out.println("Nice to meet you " + player.getName() + ".");
            System.out.println("");

        }
    }

    public void displayMenuOptions() { //In loadPlayer() method
    }

    public static void main(String[] args) {
        ViskaCLI cli = new ViskaCLI();
        cli.run();
    }
}
