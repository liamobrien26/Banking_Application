import java.time.LocalDate;

public class Transaction {

    //Instance field
    private LocalDate date;
    private double amount;
    private double balance;

    public Transaction(LocalDate date, double amount, double balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }
    public double getAmount() {
        return amount;
    }
    public double getBalance() {
        return balance;
    }

}
