package Creational.AbstractFactory.BankSystem;

public class IndividualAccountFactory implements AccountFactory {
    public Account createSavingsAccount() {
        return new IndividualSavingsAccount();
    }
    public Account createCheckingAccount() {
        return new IndividualCheckingAccount();
    }
}