package Creational.AbstractFactory.BankSystem;

public class CorporateAccountFactory implements AccountFactory {
    public Account createSavingsAccount() {
        return new CorporateSavingsAccount();
    }
    public Account createCheckingAccount() {
        return new CorporateCheckingAccount();
    }
}