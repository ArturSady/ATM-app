public class BankAccount {
    public double balance = 20000;

//    public BankAccount(int balance) {
//        this.balance = balance;
//    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
