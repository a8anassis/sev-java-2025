package gr.aueb.sev.bankapp.dto;

import java.math.BigDecimal;

public record AccountWithdrawDTO(String iban, BigDecimal amount) {
}
