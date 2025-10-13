package gr.aueb.sev.ch3;

import java.util.Scanner;

public class Bingo2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int inputNum;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
            inputNum = scanner.nextInt();

            if (inputNum != SECRET_KEY) {
                System.out.println("Not Found. try Again");
                continue;
            }

            System.out.println("Success! Bingo!");
            break;
        }

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το app!");
    }
}
