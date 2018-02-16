package theBank;

public class InvestmentAccount extends BankAccount {

    private String accountRep;
    private int amounts;

    public InvestmentAccount(String name, int balance, int amounts, String accountRep) {
        super(name, balance);
        this.amounts = amounts;
        this.accountRep = accountRep;
    }

    @Override
    public int withdraw() {
        return (int) ( super.withdraw() - (1.05 * this.amounts) );
    }

    @Override
    public int amount() {
        return amounts;
    }

    @Override
    public String toString() {
        return "InvestmentAccount{" +
                "accountRep='" + accountRep + '\'' +
                ", amounts=" + amounts +
                '}';
    }
}
