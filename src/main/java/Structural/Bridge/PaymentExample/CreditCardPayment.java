package Structural.Bridge.PaymentExample;

public class CreditCardPayment implements PaymentType{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " AZN made using Credit Card.");
    }
}
