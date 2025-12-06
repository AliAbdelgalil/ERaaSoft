package Bank;

public class Main {
    public static void main(String[] args){

        Depositor depositor = new Depositor();
        depositor.start();
        try {
            depositor.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Withdrawer withdrawer = new Withdrawer();
        withdrawer.start();
        try {
            withdrawer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BankAccount bankAccount = new BankAccount();
        System.out.println("This account current balance = "+bankAccount.getBalance());

    }
}
