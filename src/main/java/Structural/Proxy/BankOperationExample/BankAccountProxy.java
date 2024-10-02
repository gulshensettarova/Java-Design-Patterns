package Structural.Proxy.BankOperationExample;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String userRole;

    public BankAccountProxy(String userRole, double initialBalance) {
        this.userRole = userRole;
        this.realBankAccount = new RealBankAccount(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        realBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        realBankAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        if ("Admin".equalsIgnoreCase(userRole)) {
            return realBankAccount.getBalance();
        } else {
            System.out.println("Siz balansı yoxlamaq üçün yetərli icazəyə malik deyilsiniz!");
            return 0;
        }
    }
}
