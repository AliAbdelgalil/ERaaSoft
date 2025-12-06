package Bank;

public class BankAccount {

    private static double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        BankAccount.balance = balance;
    }
}
