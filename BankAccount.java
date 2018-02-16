package theBank;

public abstract class BankAccount {

    private String accountName;
    private int balance;

    public BankAccount(String accountName, int balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public int deposit() {
        return balance;
    }

    public int withdraw() {
        return balance;
    }

    public abstract int amount();
}
