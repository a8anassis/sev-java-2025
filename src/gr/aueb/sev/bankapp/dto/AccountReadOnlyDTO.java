package gr.aueb.sev.bankapp.dto;

public class AccountReadOnlyDTO {
    private String iban;
    private double balance;

    public AccountReadOnlyDTO() {

    }

    public AccountReadOnlyDTO(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
