package gr.aueb.sev.bankapp;

import gr.aueb.sev.bankapp.controller.AccountController;
import gr.aueb.sev.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.sev.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.sev.bankapp.core.exceptions.ValidationException;
import gr.aueb.sev.bankapp.dao.AccountDAOImpl;
import gr.aueb.sev.bankapp.dao.IAccountDAO;
import gr.aueb.sev.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.sev.bankapp.service.AccountServiceImpl;
import gr.aueb.sev.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    public final static Scanner scanner = new Scanner(System.in);
    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static AccountController accountController = new AccountController(accountService);

    public static void main(String[] args) {

        String option;
        String iban;

        while (true) {
            printMenu();
            option = scanner.nextLine();

            try {
                switch (option) {
                    case "1" -> {
                        System.out.println("Παρακαλώ εισάγετε το iban");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το υπόλοιπο");
                        BigDecimal balance = new BigDecimal(scanner.nextLine().trim());

                        AccountReadOnlyDTO accountReadOnlyDTO = accountController.createNewAccount(iban, balance);
                        System.out.println("Ο λογαριασμός δημιουργήθηκε (ενημερώθηκε) επιτυχώς με iban: "
                                + accountReadOnlyDTO.iban() + " αρχικό υπόλοιπο: " + accountReadOnlyDTO.balance());
                    }
                    case "2" -> {
                        System.out.println("Παρακαλώ εισάγετε το iban");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το ποσό κατάθεσης");
                        BigDecimal depositAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.deposit(iban, depositAmount);
                        System.out.println("Επιτυχής κατάθεση");
                    }
                    case "3" -> {
                        System.out.println("Παρακαλώ εισάγετε το iban");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το ποσό ανάληψης");
                        BigDecimal withdrawAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.withdraw(iban, withdrawAmount);
                        System.out.println("Επιτυχής ανάληψη");
                    }
                    case "4" -> {
                        System.out.println("Παρακαλώ εισάγετε το iban");
                        iban = scanner.nextLine().trim();

                        BigDecimal balance = accountController.getBalance(iban);
                        System.out.println("Υπόλοιπο: " + balance);
                    }
                    case "5" -> {
                        List<AccountReadOnlyDTO> accounts = accountController.getAllAccounts();

                        if (accounts.isEmpty()) {
                            System.out.println("Δεν βρέθηκαν λογαριασμοί");
                        } else {
                            accounts.forEach(System.out::println);
                        }
                    }
                    case "6" -> {
                        System.out.println("Έξοδος...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
                }
            } catch (AccountNotFoundException e) {
                System.out.println("Ο Λογαριασμός δεν βρέθηκε");
            } catch (NumberFormatException e) {
                System.out.println("Λάθος μορφή αριθμού.");
            } catch (ValidationException e) {
                System.out.println("Λάθος στην επαλήθευση: " + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Ανεπαρκές Υπόλοιπο");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n=== Account Service menu ===");
        System.out.println("1. Δημιουργία (ή ενημέρωση) λογαριασμού");
        System.out.println("2. Κατάθεση");
        System.out.println("3. Ανάληψη");
        System.out.println("4. Ερώτηση Υπολοίπου");
        System.out.println("5. Εκτύπωση όλων των λογαριασμών");
        System.out.println("6. Έξοδος");
        System.out.println("Εισάγετε μία επιλογή");
    }
}
