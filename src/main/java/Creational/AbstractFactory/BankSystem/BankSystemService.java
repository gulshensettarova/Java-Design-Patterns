package Creational.AbstractFactory.BankSystem;

public class BankSystemService {

    public static void main(String[] args) {
        AccountFactory individualFactory = new IndividualAccountFactory();
        Account individualSavings = individualFactory.createSavingsAccount();
        individualSavings.accountType(); // Çıxış: Individual Savings Account

        AccountFactory corporateFactory = new CorporateAccountFactory();
        Account corporateChecking = corporateFactory.createCheckingAccount();
        corporateChecking.accountType(); // Çıxış: Corporate Checking Account
    }
}
