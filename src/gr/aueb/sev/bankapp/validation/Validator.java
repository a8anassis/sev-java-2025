package gr.aueb.sev.bankapp.validation;

import gr.aueb.sev.bankapp.dao.AccountDAOImpl;
import gr.aueb.sev.bankapp.dao.IAccountDAO;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.service.AccountServiceImpl;
import gr.aueb.sev.bankapp.service.IAccountService;

import java.util.HashMap;
import java.util.Map;

public class Validator {
    private static final IAccountDAO accountDAO = new AccountDAOImpl();
    private static final IAccountService accountService = new AccountServiceImpl(accountDAO);

    /**
     * No instances of this class should be available.
     */
    private Validator() {}

    public static Map<String, String> validate(AccountInsertDTO dto) {

        Map<String, String> errors = new HashMap<>();

        if (dto.getIban() == null || dto.getIban().isBlank() || dto.getIban().trim().length() < 5) {
            errors.put("iban", "Το IBAN δεν μπορεί είναι μικρότερο από 5 ψηφία.");
        }

        if (accountService.isAccountExists(dto.getIban())) {
            errors.put("iban", "Το iban υπάρχει ήδη.");
        }

        return errors;
    }
}
