package Structural.Bridge.PaymentExample;

public class MobileApplication extends ApplicationType{
    public MobileApplication(PaymentType type) {
        super(type);
    }

    @Override
    public void pay(double amount) {
        type.makePayment(amount);
    }
}
