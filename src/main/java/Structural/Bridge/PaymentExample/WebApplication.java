package Structural.Bridge.PaymentExample;

public class WebApplication extends ApplicationType{
    public WebApplication(PaymentType type) {
        super(type);
    }

    @Override
    public void pay(double amount) {
        type.makePayment(amount);
    }
}
