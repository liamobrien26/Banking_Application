import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(20.00, LocalDate.of(2021, 1, 10));
        bankAccount.withdraw(20.00, LocalDate.of(2022, 1, 10));
        bankAccount.generateStatement();
    }
}
