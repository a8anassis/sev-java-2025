package gr.aueb.sev.ch4;

import java.util.Scanner;

public class NewSwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Παρακαλώ εισάγετε ένα βαθμό από 1 - 10");
        grade = scanner.nextInt();
        char classification;

        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Αποτυχία");
            case 5, 6 -> System.out.println("Καλώς");
            case 7, 8 -> System.out.println("Λίαν καλώς");
            case 9, 10 -> System.out.println("Άριστα");
            default -> System.out.println("Λάθος εισαγωγή");
        }

        // Switch expression
        classification = switch (grade) {
            case 1, 2, 3, 4 -> 'F';
            case 5, 6 -> 'G';
            case 7, 8 -> 'V';
            case 9, 10 -> 'E';
            default -> 'U';
        };
    }
}
