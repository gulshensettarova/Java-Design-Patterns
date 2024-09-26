package Structural.Bridge.PaymentExample;

public class PayPalPayment implements PaymentType{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " AZN made using PayPal.");

    }
}
