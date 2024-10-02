package Structural.Proxy.BankOperationExample;

public class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " məbləğ əlavə edildi. Cari balans: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " məbləğ çıxarıldı. Cari balans: " + balance);
        } else {
            System.out.println("Balans kifayət etmir!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

