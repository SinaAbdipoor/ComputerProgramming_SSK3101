package ssk3101_assignment19;

/**
 * This class represents a bank account
 *
 * @author sinaa
 */
class BankAccount {

    private final String name;                                                  //Name of account's owner
    private final long accountNo;
    private double balance;

    /**
     *
     * @param name Account owner's name
     * @param accountNo Account number
     */
    BankAccount(String name, long accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }

    /**
     *
     * @return The name of the account's owner
     */
    String getName() {
        return name;
    }

    /**
     *
     * @return The account number
     */
    long getAccountNo() {
        return accountNo;
    }

    /**
     *
     * @return The account balance
     */
    double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "name=" + name + ", accountNo=" + accountNo
                + ", balance=" + balance + '}';
    }

    /**
     * Deposits money into the account
     *
     * @param amount The amount of money to be added
     * @throws IllegalArgumentException If amount is less than 1
     */
    void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("The deposit amount must be more"
                    + " than 0");
        }
        balance += amount;
    }

    /**
     * Withdraws money from the account
     *
     * @param amount The amount of money to be withdrawn
     * @throws IllegalArgumentException If withdraw amount is less than the
     * balance
     */
    void withdraw(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }
}
