package IntroToOpps;

public class BankAccount {
    private double balance;
    private String ownerName;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                '}';

    }

}
