import java.util.Scanner;

public class AtmService {
    BankAccount bankAccount = new BankAccount();
    Scanner scanner = new Scanner(System.in);
    public void accountBalance(){
        System.out.println("Twoje saldo konta to: " + bankAccount.getBalance() + " PLN");
    }
    public void withdrawCash(){
        System.out.print("Podaj kwotę którą chcesz wypłacić:");
        double sum = scanner.nextDouble();
        if(sum > bankAccount.getBalance()){
            System.out.println("Nie masz wystarczających środków na koncie!");
            withdrawCash();
        }else {
            double actuallyBalance = bankAccount.getBalance() - sum;
            System.out.println("Wypłaciłeś: " + sum + "PLN" + "\n"+ "Pozostało Ci: " + actuallyBalance + "PLN");
            bankAccount.balance = actuallyBalance;
        }
    }


}
