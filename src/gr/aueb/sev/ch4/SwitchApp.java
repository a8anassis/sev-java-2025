package gr.aueb.sev.ch4;

import java.awt.*;
import java.util.Scanner;

public class SwitchApp {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω:");
            System.out.println("1. One-player game");
            System.out.println("2. Two-layer game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-layer game");
                    break;
                case 2:
                    System.out.println("Start two-player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 4);  // 4 is exit / quit
    }
}
