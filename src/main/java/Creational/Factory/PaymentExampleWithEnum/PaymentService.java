package Creational.Factory.PaymentExampleWithEnum;

public class PaymentService {
    public static void main(String[] args) {
        PaymentType paymentType = PaymentType.CREDIT_CARD;
        PaymentMethod paymentMethod = paymentType.createPaymentMethod();
        paymentMethod.makePayment(100.00);

        paymentType = PaymentType.PAYPAL;
        paymentMethod = paymentType.createPaymentMethod();
        paymentMethod.makePayment(200.00);

        paymentType = PaymentType.CRYPTO;
        paymentMethod = paymentType.createPaymentMethod();
        paymentMethod.makePayment(300.00);
    }
}
