package Creational.AbstractFactory.BankSystem;

public interface AccountFactory {
    Account createSavingsAccount();
    Account createCheckingAccount();
}