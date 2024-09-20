package Creational.Factory.PaymentExampleWithEnum;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void makePayment(double amount) {
        System.out.println("PayPal ilə " + amount + " məbləğində ödəniş həyata keçirildi.");

    }
}
