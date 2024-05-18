import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class BankAccount {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount,LocalDate date) {
        balance += amount;
        transactions.add(new Transaction(date, amount, balance));
    }

    public void withdraw(double amount,LocalDate date) {
        balance -= amount;
        transactions.add(new Transaction(date, amount, balance));
    }

    public void generateStatement() {
        System.out.println("Date                   Amount        Balance");
        for (int i = transactions.size() - 1; i >= 0; i--) {
            Transaction t = transactions.get(i);
            System.out.println(t.getDate() + "             £"+ t.getAmount()+"         £"+ t.getBalance());
        }
    }

    }


