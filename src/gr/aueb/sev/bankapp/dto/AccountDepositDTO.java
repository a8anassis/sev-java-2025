package gr.aueb.sev.bankapp.dto;

import java.math.BigDecimal;

public record AccountDepositDTO(String iban, BigDecimal amount) {
}
