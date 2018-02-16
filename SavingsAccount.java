package theBank;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private int amounts;

    public SavingsAccount(String name, int balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public int amount() {
        return amounts;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", amounts=" + amounts +
                '}';
    }
}
