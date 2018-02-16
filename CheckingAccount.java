package theBank;

public class CheckingAccount extends BankAccount {

    private String lastCheckNum;
    private int amounts;

    public CheckingAccount(String name, int balance, String lastCheckNum) {
        super(name, balance);
        this.lastCheckNum = lastCheckNum;
    }

    @Override
    public int amount() {
        return amounts;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "lastCheckNum='" + lastCheckNum + '\'' +
                ", amounts=" + amounts +
                '}';
    }
}
