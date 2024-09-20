package Creational.Factory.PaymentExampleWithEnum;

public enum PaymentType {
    CREDIT_CARD {
        @Override
        public PaymentMethod createPaymentMethod() {
            return new CreditCardPayment();
        }
    },
    PAYPAL {
        @Override
        public PaymentMethod createPaymentMethod() {
            return new PayPalPayment();
        }
    },
    CRYPTO {
        @Override
        public PaymentMethod createPaymentMethod() {
            return new CryptoPayment();
        }
    };
    public abstract PaymentMethod createPaymentMethod();

    }
