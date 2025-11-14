package gr.aueb.sev.ch13;

public class Account {

    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API

    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Amount cannot be negative");
            }
            balance += amount;
        } catch (Exception e) {
            System.err.println("Negative amount: " + amount + " is not valid" + e);
            throw e;
        }
    }

    /**
     * Withdraws the specified amount from the {@link Account}.
     * @param amount        the amount to withdraw.
     * @param ssn           the ssn of the {@link Account} holder.
     * @throws Exception    if the amount is negative, or if the balance is not
     *                      sufficient, or if the ssn is not valid.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Amount cannot be negative");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }
            if (!isSsnValid(ssn)) {
                throw new Exception("Invalid ssn");
            }
            balance -= amount;      // balance = balance - amount
        } catch (Exception e) {
            System.err.println("Withdraw failed: " + e);
            //e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the current balance of the {@link Account}.
     * @return  the current balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
