package Structural.Bridge.PaymentExample;

public class BankTransferPayment implements PaymentType {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " AZN made using Bank Transfer.");
    }
}
