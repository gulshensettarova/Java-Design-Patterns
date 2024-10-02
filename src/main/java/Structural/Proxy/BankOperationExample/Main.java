package Structural.Proxy.BankOperationExample;

public class Main {
    public static void main(String[] args) {
        // Admin rolu ilə Proxy yaradılır
        BankAccount adminAccount = new BankAccountProxy("Admin", 1000);
        adminAccount.deposit(500);
        adminAccount.withdraw(200);
        System.out.println("Admin balansı: " + adminAccount.getBalance());

        // İstifadəçi rolu ilə Proxy yaradılır
        BankAccount userAccount = new BankAccountProxy("User", 1000);
        userAccount.deposit(300);
        userAccount.withdraw(100);
        System.out.println("İstifadəçi balansı: " + userAccount.getBalance());
    }
}
