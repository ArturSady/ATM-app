import java.util.Scanner;

public class AtmService {
    BankAccount bankAccount = new BankAccount();
    // AtmMenu menu = new AtmMenu();
    Scanner scanner = new Scanner(System.in);

    public void accountBalance() {
        System.out.println("Twoje saldo konta to: " + bankAccount.getBalance() + " PLN");
    }

    public void paymentCash() {
        System.out.print("""
                Jaką Kwotę chcesz wypłacić:
                1.500 PLN
                2.200 PLN
                3.100 PLN
                4.50 PLN
                5.Inna kwota 
                """);
        int choiceNum = scanner.nextInt();
        switch (choiceNum) {
            case 1:
                double money1 = 500;
                bankAccount.add(money1);
                System.out.println("Wpłacono 500 PLN Twoje aktualne saldo to: " + bankAccount.balance + " PLN");
                break;
            case 2:
                double money2 = 200;
                bankAccount.add(money2);
                System.out.println("Wpłacono 200 PLN Twoje aktualne saldo to: " + bankAccount.balance + " PLN");
                break;
            case 3:
                double money3 = 100;
                bankAccount.add(money3);
                System.out.println("Wpłacono 100 PLN Twoje aktualne saldo to: " + bankAccount.balance + " PLN");
                break;
            case 4:
                double money4 = 50;
                bankAccount.add(money4);
                System.out.println("Wpłacono 50 PLN Twoje aktualne saldo to: " + bankAccount.balance + " PLN");
                break;
            case 5:
                double customerCash = scanner.nextDouble();
                bankAccount.add(customerCash);
                System.out.println("Wpłacono " + customerCash + " PLN Twoje aktualne saldo to: " + bankAccount.balance + " PLN");
                break;
        }
    }

    public void withdrawCash() {
        System.out.println("""
                Wybierz kwotę, którą chcesz wypłacić: 
                1.500 PLN
                2.200 PLN
                3.100 PLN
                4.50 PLN
                5.Inna kwota""");
        int choiceNum2 = scanner.nextInt();
        switch (choiceNum2) {
            case 1:
                double moneyToWithdraw1 = 500;

                if (bankAccount.balance < moneyToWithdraw1) {
                    System.out.println("Nie masz wystarczających środków na koncie");
                } else {
                    bankAccount.subtract(moneyToWithdraw1);
                    System.out.println("Wypłaciłeś 500 PLN, Twoje aktulne saldo to " + bankAccount.balance + " PLN");
                    break;
                }
            case 2:
                double moneyToWithdraw2 = 200;
                if (bankAccount.balance < moneyToWithdraw2) {
                    System.out.println("Nie masz wystarczających środków na koncie");
                } else {
                    bankAccount.subtract(moneyToWithdraw2);
                    System.out.println("Wypłaciłeś 200 PLN, Twoje aktulne saldo to " + bankAccount.balance + " PLN");
                    break;
                }
            case 3:
                double moneyToWithdraw3 = 100;
                if (bankAccount.balance < moneyToWithdraw3) {
                    System.out.println("Nie masz wystarczających środków na koncie");
                } else {
                    bankAccount.subtract(moneyToWithdraw3);
                    System.out.println("Wypłaciłeś 100 PLN, Twoje aktulne saldo to " + bankAccount.balance + " PLN");
                    break;
                }
            case 4:
                double moneyToWithdraw4 = 50;
                if (bankAccount.balance < moneyToWithdraw4) {
                    System.out.println("Nie masz wystarczających środków na koncie");
                } else {
                    bankAccount.subtract(moneyToWithdraw4);
                    System.out.println("Wypłaciłeś 50 PLN, Twoje aktulne saldo to " + bankAccount.balance + " PLN");
                    break;
                }
            case 5:
                System.out.print("Podaj kwotę, którą chcesz wypłacić: ");
                double customerCashToWithdraw = scanner.nextDouble();
                if (bankAccount.balance < customerCashToWithdraw) {
                    System.out.println("Nie masz wystarczających środków na koncie");
                } else {
                    bankAccount.subtract(customerCashToWithdraw);
                    System.out.println("Wypłaciłeś " + customerCashToWithdraw +" PLN, Twoje aktulne saldo to " + bankAccount.balance + " PLN");
                    break;

                }
        }
    }
}
