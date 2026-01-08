package gr.aueb.sev.bankapp.validation;

import gr.aueb.sev.bankapp.dao.AccountDAOImpl;
import gr.aueb.sev.bankapp.dao.IAccountDAO;
import gr.aueb.sev.bankapp.dto.AccountDepositDTO;
import gr.aueb.sev.bankapp.dto.AccountInsertDTO;
import gr.aueb.sev.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.sev.bankapp.service.AccountServiceImpl;
import gr.aueb.sev.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {
    private static final IAccountDAO accountDAO = new AccountDAOImpl();
    private static final IAccountService accountService = new AccountServiceImpl(accountDAO);

    /**
     * No instances of this class should be available.
     */
    private Validator() {}

    public static Map<String, String> validateInsertDTO(AccountInsertDTO insertDTO) {

        Map<String, String> errors = new HashMap<>();

        if (insertDTO.iban() == null || insertDTO.iban().isBlank() || insertDTO.iban().trim().length() > 25) {
            errors.put("iban", "Το IBAN δεν μπορεί είναι κενό ή μεγαλύτερο από 25 ψηφία.");
        }

        if (insertDTO.balance() == null ||  insertDTO.balance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το υπόλοιπο δεν μπορεί να είναι αρνητικό");
        }
        return errors;
    }

    public static Map<String, String> validateDepositDTO(AccountDepositDTO depositDTO) {

        Map<String, String> errors = new HashMap<>();

        if (depositDTO.iban() == null || depositDTO.iban().isBlank() || depositDTO.iban().trim().length() > 25) {
            errors.put("iban", "Το IBAN δεν μπορεί είναι κενό ή μεγαλύτερο από 25 ψηφία.");
        }

        if (depositDTO.amount() == null ||  depositDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("amount", "Το ποσό κατάθεσης δεν μπορεί να είναι αρνητικό");
        }

        return errors;
    }

    public static Map<String, String> validateWithdrawDTO(AccountWithdrawDTO withdrawDTO) {

        Map<String, String> errors = new HashMap<>();

        if (withdrawDTO.iban() == null || withdrawDTO.iban().isBlank() || withdrawDTO.iban().trim().length() > 25) {
            errors.put("iban", "Το IBAN δεν μπορεί είναι κενό ή μεγαλύτερο από 25 ψηφία.");
        }

        if (withdrawDTO.amount() == null || withdrawDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("amount", "Το ποσό ανάληψης δεν μπορεί να είναι αρνητικό");
        }

        return errors;
    }
}
