package gr.aueb.sev.bankapp.dto;

import java.math.BigDecimal;

public class AccountInsertDTO {
    private String iban;
    private BigDecimal balance;

    public AccountInsertDTO() {

    }

    public AccountInsertDTO(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
