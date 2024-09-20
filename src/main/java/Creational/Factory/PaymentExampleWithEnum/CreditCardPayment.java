package Creational.Factory.PaymentExampleWithEnum;

public class CreditCardPayment  implements  PaymentMethod{
    @Override
    public void makePayment(double amount) {
        System.out.println("Kredit kartı ilə " + amount + " məbləğində ödəniş həyata keçirildi.");
    }
}
