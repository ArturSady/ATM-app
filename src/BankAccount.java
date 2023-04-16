public class BankAccount {
    public double balance = 100;

//    public BankAccount(int balance) {
//        this.balance = balance;
//    }
    public void add(double addSum){
        balance = balance + addSum;
    }
    public void subtract(double subtractSum){
        balance = balance - subtractSum;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return balance + "PLN";
    }
}
