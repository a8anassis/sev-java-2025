package gr.aueb.sev.bankapp.core.exceptions;

public class insufficientBalanceException extends Exception {

    public insufficientBalanceException(String message) {
        super(message);
    }
}
