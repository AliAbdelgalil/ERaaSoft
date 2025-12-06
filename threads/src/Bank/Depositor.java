package Bank;

public class Depositor extends Thread {

    public void run(){
        deposit(555);
    }
    public synchronized void deposit(double amount){
       BankAccount account = new BankAccount();
        account.setBalance(account.getBalance()+amount);
        notifyAll();
        System.out.println("Current balance after deposit: " + account.getBalance());

    }
}
