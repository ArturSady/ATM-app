import java.util.Scanner;

public class AtmMenu {
  //  private BankAccount bankAccount = new BankAccount();
AtmService atmService = new AtmService();
 private Scanner scanner = new Scanner(System.in);
    public void startMenu(){

        System.out.print("""
                              Wybierz opcję:
                              1.Sprawdź saldo konta
                              2.Wypłać pieniądze
                              3.Zakończ
                              """);
        int numberChoice = scanner.nextInt();

        if (numberChoice == 1){
            atmService.accountBalance();
            startMenu();
        }if (numberChoice == 2){
            atmService.withdrawCash();
            startMenu();
        }if (numberChoice == 3){
            System.exit(0);
        }

        else {
            System.out.println("Wybierz jedną z opcji:");
            startMenu();
        }


    }
}
