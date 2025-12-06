package Bank;

public class Withdrawer extends Thread {

    @Override
    public void run() {
        withdraw(200);
    }
    public synchronized void withdraw(double amount){
        BankAccount Account = new BankAccount();
        if (amount > Account.getBalance())
        {
            System.out.println("this account doesn't have enough balance");

            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
        Account.setBalance(Account.getBalance()-amount);}
        System.out.println("Current balance after withdrawal: " + Account.getBalance());
    }
}
